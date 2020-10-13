package processor;

import java.util.Scanner;

public class UserInterface {

    public Scanner scanner;
    public MatrixManager matrixManager;

    public UserInterface(Scanner scanner, MatrixManager matrixManager) {
        this.scanner = scanner;
        this.matrixManager = matrixManager;
    }

    public void start() {
        while (true) {
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Calculate a determinant");
            System.out.println("6. Inverse matrix");
            System.out.println("0. Exit");
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Enter size of first matrix");
                double[][] first = MatrixManager.addSumOrMul();
                System.out.println("Enter size of second matrix");
                double[][] second = MatrixManager.addSumOrMul();
                MatrixManager.testError(first, second);
            }

            if (command == 2) {
                System.out.println("Enter size of matrix:");
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();

                int[][] first = new int[rows][columns];
                System.out.println("Enter Matrix:");
                MatrixManager.addMatrix(first, scanner);
                System.out.println("add constant to multiply");
                MatrixManager.multiplyMatrix(first, scanner);
                MatrixManager.printMatrix(first);

            }

            if (command == 3) {
                System.out.println("Enter size of first matrix");
                double[][] first = MatrixManager.addSumOrMul();
                System.out.println("Enter size of second matrix");
                double[][] second = MatrixManager.addSumOrMul();
                MatrixManager.printMatrix(MatrixManager.multiplyMatrices(first, second));

            }
            if (command == 4) {
                System.out.println("1. Main diagonal");
                System.out.println("2. Side diagonal");
                System.out.println("3. Vertical line");
                System.out.println("4. Horizontal line");

                int commandInside = scanner.nextInt();
                if (commandInside == 1) {
                    double[][] diagonal = MatrixManager.addMatrixT();
                    MatrixManager.printCuteMatrix(MatrixManager.mainDiagonal(diagonal));
                }
                if (commandInside == 2) {

                    double[][] diagonalSide = MatrixManager.addMatrixT();
                    MatrixManager.printReverseRows(MatrixManager.sideDiagonal(diagonalSide));
                }
                if (commandInside == 3) {
                    double[][] vertical = MatrixManager.addMatrixT();
                    MatrixManager.printVerticalLine(MatrixManager.verticalLine(vertical));

                }
                if (commandInside == 4) {
                    double[][] horizontal = MatrixManager.addMatrixT();
                    MatrixManager.printHorizontalLine(MatrixManager.horizontalLine(horizontal));
                }


            }
            if (command == 5) {
                double[][] determinant = MatrixManager.addMatrixT();
                System.out.println(MatrixManager.createSub(determinant));

            }
            if (command == 6) {
                System.out.println("Enter matrix size:");
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();

                if(rows != columns || rows < 3){
                    System.out.println("This matrix doesn't have an inverse.");
                }else {

                    double[][] matrixOfMinors = MatrixManager.addInverseMatrix(rows,columns);

                    MatrixManager.matrixOfMinors(matrixOfMinors);
                }
            }

            if (command == 0) {

                System.out.println("EXIT");
                break;
            }

        }
    }


}

//  MatrixManager.multiplyMatrix(first, scanner);
//    MatrixManager.printMatrix(first);


//  addMatrix(second, sc);


// if (rows == rowsSecond && columns == columnsSecond) {
//     sumMatrix(first, second);
//  } else {
//      System.out.println("ERROR");
//    }

