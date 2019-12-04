package a8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model _model, View _view) {
        this.model = _model;
        this.view = _view;

        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        System.out.println(b.getText());
    }
}
