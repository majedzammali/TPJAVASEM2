
import java.util.Scanner;
public class ex1tableau {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = ex1.lecturen(sc);
    double[] tab = new double[n];
    System.out.println("donne un nomber x");
    int x = ex1.lecturen(sc);
    remplirTab(tab, sc);
    double sum = somme(tab);
    System.out.println(sum);
    increment(tab,  x);
    for (int i = 0; i < tab.length; i++) {
        System.out.println(tab[i]);
    }
    sc.close();
  }

  public static double remplirTab(double[] tab, Scanner sc) {
    for (int i = 0; i < tab.length; i++) {
        System.out.print("Entrez un entier: ");
        tab[i] = sc.nextDouble();
    }
    return 0;
  }

  public static double somme(double[] tab) {
    double s = 0;
    for (int i = 0; i < tab.length; i++) {
        s = s + tab[i];
    }
    return s;
  }

  public static void increment(double[] tab, int x) {
    for (int i = 0; i < tab.length; i++) {
        tab[i] = tab[i] + x;
    }
  }
}
