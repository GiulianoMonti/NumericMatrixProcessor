package processor;

import java.util.Locale;
import java.util.Scanner;

public class MatrixManager {
    public static boolean first;
    public static boolean second;
    public static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    public static double determinant =0 ;
    public MatrixManager() {
        first = true;
        second = false;
    }

    public static double[][] addSumOrMul() {
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        double[][] array = new double[rows][columns];

        if (first) {
            System.out.println("Enter first matrix:");
        }
        if (second) {
            System.out.println("Enter second matrix:");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        second = true;
        first = false;
        return array;
    }

    public static double[][] addMatrixT() {
        System.out.println("Enter matrix size:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter matrix:");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }

    public static double[][] sumMatrix(double[][] first, double[][] second) {


        double[][] newArray = new double[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                newArray[i][j] = first[i][j] + second[i][j];
            }
        }
        return newArray;
    }

    public static void printMatrix(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void testError(double[][] first, double[][] second) {

        if (first.length == second.length && first[0].length == second[0].length) {
            printMatrix(sumMatrix(first, second));
        } else {
            System.out.println("ERROR");

        }

    }

    public static double[][] multiplyMatrices(double[][] first, double[][] second) {


        double[][] newArray = new double[first.length][second[0].length];
        double mult = 1;
        double sum = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < first[0].length; k++) {
                    newArray[i][j] += first[i][k] * second[k][j];

                }
            }
        }

        return newArray;
    }

    public static double[][] mainDiagonal(double[][] matrix) {

        double[][] newArray = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newArray[i][j] = matrix[j][i];

            }
        }
        return newArray;
    }

    public static double[][] sideDiagonal(double[][] matrix) {

        double[][] newArray = new double[matrix.length][matrix[0].length];

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                newArray[i][j] = matrix[j][i];
            }
        }
        return newArray;
    }

    public static double[][] verticalLine(double[][] matrix) {

        double[][] newArray = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {

                newArray[i][j] = matrix[i][j];

            }
        }
        return newArray;
    }

    public static double[][] horizontalLine(double[][] matrix) {

        double[][] newArray = new double[matrix.length][matrix[0].length];

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {

                newArray[i][j] = matrix[i][j];

            }
        }
        return newArray;
    }

    public static void printReverseRows(double[][] array) {
        System.out.println("The result is:");

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[0].length - 1; j >= 0; j--) {              //r and c --
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }


    public static void printCuteMatrix(double[][] array) {
        System.out.println("The result is:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printVerticalLine(double[][] array) {                 //
        System.out.println("The result is:");

        for (int i = 0; i < array.length; i++) {
            for (int j = array[0].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printHorizontalLine(double[][] array) {
        System.out.println("The result is:");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] addMatrix(int[][] array, Scanner scanner) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void multiplyMatrix(int[][] array, Scanner scanner) {


        int x = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] *= x;
            }
        }

    }

    public static void printMatrix(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print((int) array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] addInverseMatrix(int rows,int columns) {

        double[][] array = new double[rows][columns];

        System.out.println("Enter Matrix");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }

    ///public static double findDeterminant(double[][] matrix) {
    //double[][] b = new double[matrix.length - 1][matrix.length - 1];

    //double det = 0;
    //int rows = matrix.length;
    //int columns = matrix[0].length;
    //double oneDeterminant = matrix[0][0];
    //int sign = 1;

    //if (matrix.length == 1) {
    //  return oneDeterminant;

    //} else if (matrix.length == 2) {

    //  return ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));

    //} else


    //  for (int i = 0; i < rows; i++) {

    //    }
    //  return 0;

    //}


    public static double createSub(double[][] matrix) {

        int x = 0;
        int y = 0;
        int sign = 1;
        double det = 0;
        double[][] subMatrix = new double[matrix.length - 1][matrix.length - 1];    //small matrix
        double oneDeterminant = matrix[0][0];

        if (matrix.length == 1) {
            return oneDeterminant;
        } else if (matrix.length == 2) {

            return ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));

        } else

            for (int c = 0; c <= matrix.length - 1; c++) {          // numbers to skip 000 001 002

                x = 0;      // restart the new small matrix rows to make new one
                y = 0;      //
                for (int i = 0; i <= matrix.length - 1; i++) {              //rows

                    for (int j = 0; j <= matrix.length - 1; j++) {          //columns

                        //first row || columns//
                        if (i == 0 || j == c) {      // rows and columns that i need to skip, dont want to think anymore so we do an else
                        } else {

                            subMatrix[x][y] = matrix[i][j];             //little matrix with new "x,y" because,
                            y++;                                        //outofbounds if i enter "i j" :P.
                            if (y == subMatrix.length) {                //restart y and add x 00 01 10 11|| need to restart x y when we reach length
                                x++;
                                y = 0;
                            }
                        }
                    }
                    //System.out.println();
                }
                det += matrix[0][c] * createSub(subMatrix) * Math.pow(-1, c + 2);   //recursion,with the formula magic
                //A00    *   sub matrix         *  (-1) mathpow(rows col)
                //      cofactor(subMatrix, matrix[0][c]);

            }
        return det;
    }

    public static void matrixOfMinors(double[][] matrix) {             // Step 1: Matrix of Minors
        //The first step is to create a "Matrix of Minors". This step has the most calculations.
        int x = 0;
        int y = 0;
        determinant=createSub(matrix);
        double[][] matrixOfMinors = new double[matrix.length - 1][matrix.length - 1];    //small matrix
        double[][] matrixOfMinorsEnd = new double[matrix.length][matrix.length];    //small matrix

        for (int f = 0; f <= matrix.length - 1; f++) {                  //rows

            for (int c = 0; c <= matrix.length - 1; c++) {              //columns
                x = 0;
                y = 0;

                for (int i = 0; i <= matrix.length - 1; i++) {          //rows

                    for (int j = 0; j <= matrix.length - 1; j++) {      //columns

                        if (i == f || j == c) {
                        } else {

                            matrixOfMinors[x][y] = matrix[i][j];             //matrix of minors
                            y++;
                            if (y == matrixOfMinors.length) {
                                x++;
                                y = 0;
                            }
                            //     System.out.println(x + "x  " + "y " + y);

                        }


                    }

                }
                matrixOfMinorsEnd[f][c] = createSub(matrixOfMinors) ;  //determinant method does it all by itself
            }                                                           //


        }

        mainDiagonalMinors(matrixOfMinorsEnd);              //


    }


    public static void mainDiagonalMinors(double[][] array) {
        double[][] minors = new double[array.length][array.length];    //
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {            //Step 2: Matrix of Cofactors
                if((i+j)%2!=0){
                    minors[i][j]=array[i][j]*(-1);
                }else{
                    minors[i][j]=array[i][j];
                }
            }
        }
        printInverseDeterminant(mainDiagonal(minors));              //Step 3: Adjugate (also called Adjoint)

    }

    public static void printInverseDeterminant(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print((1/determinant)*array[i][j]+ " ");               //Step 4: Multiply by 1/Determinant

            }                               //
            System.out.println();
        }
    }
}


//   public static void matrixOfCofactors(double[][] array) {
//     double[][] minors = new double[array.length][array.length];    //small matrix
//   for (int i = 0; i < array.length; i++) {
//     for (int j = 0; j < array.length; j++) {
//       if((i+j)%2!=0){
//         minors[i][j]=array[i][j]*(-1);                  //
//   }else{
//     minors[i][j]=array[i][j];
//            }
//      }
//    }
//  printDeterminant(mainDiagonal(minors));
// }




    /*public static double cofactor(double[][] matrix, double indice) {
    double oneDeterminant = matrix[0][0];
     double det = 0;
    double first = 0;

      if (matrix.length == 1) {
           return oneDeterminant;

      } else if (matrix.length == 2) {

            return ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));

      } else

            for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
              first = indice * matrix[i][j];
            }
          }

            return first;
       }*/





