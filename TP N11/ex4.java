import java.util.Scanner;

public class ex4 {

    // Lire un entier strictement positif
    public static int lectureN(String nom) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la valeur de " + nom + " (> 0) : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : " + nom + " doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }

    // Remplir la matrice M[n1][n2] par des réels
    public static double[][] remplirTab(int n1, int n2) {
        Scanner scanner = new Scanner(System.in);
        double[][] M = new double[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = scanner.nextDouble();
            }
        }

        return M;
    }

    // Calculer la somme des valeurs de la ligne d'indice i
    public static double calculSomme(double[][] M, int n2, int i) {
        double somme = 0;
        for (int j = 0; j < n2; j++) {
            somme += M[i][j];
        }
        return somme;
    }

    // Programme principal
    public static void main(String[] args) {
        int n1 = lectureN("n1 (nombre de lignes)");
        int n2 = lectureN("n2 (nombre de colonnes)");

        double[][] M = remplirTab(n1, n2);

        System.out.println("\n--- Somme des lignes de la matrice ---");
        for (int i = 0; i < n1; i++) {
            double sommeLigne = calculSomme(M, n2, i);
            System.out.printf("Somme de la ligne %d : %.2f\n", i, sommeLigne);
        }
    }
}