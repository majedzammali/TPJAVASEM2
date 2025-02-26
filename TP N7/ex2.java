import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1, n2;
    
    do {
      System.out.print("Enter n1 (1-29): ");
      n1 = scanner.nextInt();
    } while (n1 <= 0 || n1 >= 30);
    
    do {
      System.out.print("Enter n2 (1-29): ");
      n2 = scanner.nextInt();
    } while (n2 <= 0 || n2 >= 30);
    int[][] M = new int[n1][n2];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n2; j++) {
        System.out.printf("M[%d][%d] = ", i, j);
        M[i][j] = scanner.nextInt();
      }
    }
    int sum = 0;
    long product = 1;
    
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n2; j++) {
        sum += M[i][j];
        product *= M[i][j];
      }
    }
    
    double average = (double) sum / (n1 * n2);
    System.out.println("\nResults:");
    System.out.println("Sum = " + sum);
    System.out.println("Product = " + product);
    System.out.printf("Average = %.2f%n", average);
    
    scanner.close();
  }
}