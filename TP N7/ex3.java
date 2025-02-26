import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        
        do {
            System.out.print("Enter number of rows (n1 ≤ 20): ");
            n1 = scanner.nextInt();
        } while (n1 <= 0 || n1 > 20);
        
        do {
            System.out.print("Enter number of columns (n2 ≤ 30): ");
            n2 = scanner.nextInt();
        } while (n2 <= 0 || n2 > 30);
        
        int[][] M = new int[n1][n2];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.printf("M[%d][%d] = ", i, j);
                M[i][j] = scanner.nextInt();
            }
        }
        
        int[] T = new int[n1];
        for (int i = 0; i < n1; i++) {
            int sum = 0;
            for (int j = 0; j < n2; j++) {
                sum += M[i][j];
            }
            T[i] = sum;
        }
        
        int minSum = T[0];
        int maxSum = T[0];
        for (int i = 1; i < n1; i++) {
            if (T[i] < minSum) minSum = T[i];
            if (T[i] > maxSum) maxSum = T[i];
        }
        
        System.out.println("\nRow sums:");
        for (int i = 0; i < n1; i++) {
            System.out.println("Row " + i + ": " + T[i]);
        }
        System.out.println("\nMinimum sum: " + minSum);
        System.out.println("Maximum sum: " + maxSum);
        
        scanner.close();
    }
}