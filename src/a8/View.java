package a8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class View extends JApplet {
    private static final int ROWS_NUMBER = 20;
    private static final int COLS_NUMBER = 30;
    private boolean leftButtonPressed;
    private boolean click = false;
    private Model model = new Model(ROWS_NUMBER, COLS_NUMBER, false);
    private JLabel[][] area = new JLabel[ROWS_NUMBER][COLS_NUMBER];
    private JPanel oneJPanel = new JPanel();
    private JPanel twoJPanel = new JPanel();
    private JPanel threeJPanel = new JPanel();
    private JPanel fourJPanel = new JPanel();
    private GridLayout gridLayout1 = new GridLayout();
    private JButton nextGenButton = new JButton();
    private JButton eraseButton = new JButton();

    public void start() {
        this.setSize(new Dimension(420, 320));
        oneJPanel.setLayout(null);
        twoJPanel.setBackground(Color.black);
        twoJPanel.setBounds(new Rectangle(16, 11, 362, 227));
        twoJPanel.setLayout(gridLayout1);
        gridLayout1.setColumns(COLS_NUMBER);
        gridLayout1.setHgap(0);
        gridLayout1.setRows(ROWS_NUMBER);
        gridLayout1.setVgap(0);
        threeJPanel.setBounds(new Rectangle(19, 268, 384, 39));
        threeJPanel.setLayout(null);
        nextGenButton.setBounds(new Rectangle(182, 6, 83, 26));
        nextGenButton.setMargin(new Insets(2, 1, 2, 1));
        nextGenButton.setText("Next");

        nextGenButton.addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER) {
                    nextGeneration();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });
        nextGenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                nextGeneration();
            }
        });
        eraseButton.setText("Clear");
        eraseButton.setMargin(new Insets(2, 1, 2, 1));
        eraseButton.setBounds(new Rectangle(86, 6, 83, 26));
        eraseButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < area.length; i++) {
                    for (int j = 0; j < area[0].length; j++) {
                        area[i][j].setBackground(Color.BLACK); // Color of board after clear button pressed
                    }
                }
                model.clearArea();
            }
        });
        fourJPanel.setBounds(new Rectangle(14, 8, 392, 250));
        fourJPanel.setLayout(null);
        this.getContentPane().add(oneJPanel, BorderLayout.CENTER);
        threeJPanel.add(eraseButton, null);
        threeJPanel.add(nextGenButton, null);
        oneJPanel.add(fourJPanel, null);
        fourJPanel.add(twoJPanel, null);
        oneJPanel.add(threeJPanel, null);

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                area[i][j] = new JLabel();
                area[i][j].setBackground(Color.BLACK); // Background color of board
                area[i][j].setOpaque(true);
                area[i][j].setBorder(BorderFactory.createLineBorder(Color.darkGray)); // Border color of cells
                area[i][j].addMouseListener(new MouseListener(){
                    @Override
                    public void mouseClicked(MouseEvent e) {}

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        if (click) {
                            Object o = e.getSource();
                            if (leftButtonPressed) {
                                ((JLabel) o).setBackground(Color.yellow); // Color of gen
                            } else {
                                ((JLabel) o).setBackground(Color.black); // Color of empty cell
                            }
                        }

                        boolean[][] area2 = new boolean[ROWS_NUMBER][COLS_NUMBER];
                        for (int i = 0; i < area2.length; i++) {
                            for (int j = 0; j < area2[0].length; j++) {
                                if (area[i][j].getBackground().equals(Color.yellow)) {
                                    area2[i][j] = true;
                                } else {
                                    area2[i][j] = false;
                                }
                            }
                        }

                        model.setArea(area2);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        click = true;
                        Object o = e.getSource();
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            leftButtonPressed = true;
                            ((JLabel) o).setBackground(Color.yellow); // Color of gen
                        } else if (e.getButton() == MouseEvent.BUTTON3) {
                            leftButtonPressed = false;
                            ((JLabel) o).setBackground(Color.black); // Color of empty cell
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        click = false;
                    }
                });
                twoJPanel.add(area[i][j]);
            }
        }
    }

    public void addActionListener(ActionListener l) {
        for (Component c: oneJPanel.getComponents()) {
            JButton b = (JButton) c;
            b.addActionListener(l);
        }
    }

    public void runThrough() {
        for (int t = 0; t < 10; t++) {
            model.nextGeneration();
            boolean[][] area2 = model.getArea();
            for (int i = 0; i < area2.length; i++) {
                for (int j = 0; j < area2[0].length; j++) {
                    if (area2[i][j]) {
                        area[i][j].setBackground(Color.yellow); // Color of gen
                    } else {
                        area[i][j].setBackground(Color.black); // Color of empty cell
                    }
                }
            }
        }
    }

    private void nextGeneration() {
        model.nextGeneration();

        boolean[][] area2 = model.getArea();
        for (int i = 0; i < area2.length; i++) {
            for (int j = 0; j < area2[0].length; j++) {
                if (area2[i][j]) {
                    area[i][j].setBackground(Color.yellow); // Color of gen
                } else {
                    area[i][j].setBackground(Color.black); // Color of empty cell
                }
            }
        }
    }
}
