// 8.29
import java.util.Scanner;

public class Test2DArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter dimensions for the arrays
        System.out.println("Enter the number of rows for the arrays:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns for the arrays:");
        int cols = input.nextInt();

        int[][] m1 = new int[rows][cols];
        int[][] m2 = new int[rows][cols];

        // Enter elements for the first array
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // Enter elements for the second array
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        // Print arrays for debugging purposes
        System.out.println("First array:");
        printArray(m1);
        System.out.println("Second array:");
        printArray(m2);

        // Check if the arrays are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }

        input.close();
    }

    // Method to compare two 2D arrays
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}