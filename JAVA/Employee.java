import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void setData(int[] flatData) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = flatData[i * cols + j];
            }
        }
    }

    public void sortt(int colIndex) {
        int[] column = new int[rows];
        for (int i = 0; i < rows; i++) {
            column[i] = data[i][colIndex];
        }
        Arrays.sort(column);
        for (int i = 0; i < rows; i++) {
            data[i][colIndex] = column[i];
        }
    }

    public int[][] getData() {
        return data;
    }
}

public class Employee {
    public static void print(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MATRIX.in"));
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int colIndex = sc.nextInt() - 1; 
                int[] flatData = new int[n * m];
                for (int i = 0; i < n * m; i++) {
                    flatData[i] = sc.nextInt();
                }
                Matrix matrix = new Matrix(n, m);
                matrix.setData(flatData);
                matrix.sortt(colIndex);
                printMatrix(matrix.getData());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    
}