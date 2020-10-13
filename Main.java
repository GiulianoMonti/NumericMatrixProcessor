package processor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MatrixManager manager = new MatrixManager();
        UserInterface ui = new UserInterface(scanner, manager);
        ui.start();
    }
}


