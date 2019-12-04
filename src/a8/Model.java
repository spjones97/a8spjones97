package a8;

public class Model {
    private boolean[][] area;
    private boolean there;
    private int rows;
    private int cols;

    public Model(int _rows, int _cols, boolean _there) {
        this.rows = _rows;
        this.cols = _cols;
        this.there = _there;
        this.area = new boolean[_rows][_cols];
    }

    public void nextGeneration() {
        int cell = 0, row, col;
        boolean[][] areaCopy = this.copyOfArea();

        // Sought out help with nextGen algorithm
        for (row = 0; row < rows; row++) {
            for (col = 0; col < cols; col++) {
                if (there) {
                    if (row == 0 && col == 0) {
                        if (areaCopy[rows - 1][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == cols - 1) {
                        if (areaCopy[rows - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col == 0) {
                        if (areaCopy[row - 1][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col == cols - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][0]) {
                            cell++;
                        }
                    } else if (row == 0 && col != cols - 1) {
                        if (areaCopy[rows - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[rows - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col != cols - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[0][col]) {
                            cell++;
                        }
                        if (areaCopy[0][col + 1]) {
                            cell++;
                        }
                    } else if (row != rows - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][cols - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rows - 1 && row != 0 && col == cols - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][0]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][0]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][0]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                } else {
                    if (row == 0 && col == 0) {
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col == cols - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col == cols - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                    } else if (row == 0 && col != cols - 1) {
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row == rows - 1 && col != cols - 1 && col != 0) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                    } else if (row != rows - 1 && row != 0 && col == 0) {
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    } else if (row != rows - 1 && row != 0 && col == cols - 1) {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                    } else {
                        if (areaCopy[row - 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row - 1][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row][col + 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col - 1]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col]) {
                            cell++;
                        }
                        if (areaCopy[row + 1][col + 1]) {
                            cell++;
                        }
                    }
                }
                if (areaCopy[row][col]) {
                    if (cell == 0 || cell == 1 || cell >= 4) {
                        area[row][col] = false;
                    }
                } else {
                    if (cell == 3) {
                        area[row][col] = true;
                    }
                }
                cell = 0;
            }
        }
    }

    public boolean[][] getArea() {
        return area;
    }

    public void setArea(boolean[][] area) {
        this.area = area;
    }

    public void clearArea() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                area[i][j] = false;
            }
        }
    }

    private boolean[][] copyOfArea() {
        boolean[][] newArea = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            if (cols >= 0) System.arraycopy(area[row], 0, newArea[row], 0, cols);
        }
        return newArea;
    }

    protected Model clone() {
        Model view = new Model(rows, cols, there);
        view.area = this.copyOfArea();
        return view;
    }
}