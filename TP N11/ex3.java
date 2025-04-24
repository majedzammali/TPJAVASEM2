import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {

    // Lire un entier strictement positif
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : n doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }

    // Remplir le tableau T avec des entiers positifs
    public static int[] remplirTab(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            int val;
            do {
                System.out.print("T[" + i + "] = ");
                val = scanner.nextInt();
                if (val < 0) {
                    System.out.println("Erreur : veuillez entrer un entier positif.");
                }
            } while (val < 0);
            T[i] = val;
        }
        return T;
    }

    // Créer le tableau des entiers pairs
    public static int[] creerTpair(int[] T) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int val : T) {
            if (val % 2 == 0) {
                temp.add(val);
            }
        }

        int[] T_pair = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            T_pair[i] = temp.get(i);
        }
        return T_pair;
    }

    // Créer le tableau des entiers impairs
    public static int[] creerTimpair(int[] T) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int val : T) {
            if (val % 2 != 0) {
                temp.add(val);
            }
        }

        int[] T_impair = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            T_impair[i] = temp.get(i);
        }
        return T_impair;
    }

    // Afficher un tableau
    public static void afficheTab(int[] T, String nom) {
        System.out.print(nom + " = [ ");
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println("]");
    }

    // Programme principal
    public static void main(String[] args) {
        int n = lectureN();
        int[] T = remplirTab(n);
        int[] T_pair = creerTpair(T);
        int[] T_impair = creerTimpair(T);

        // Affichage des résultats
        afficheTab(T, "Tableau T");
        afficheTab(T_pair, "Tableau T_pair (pairs)");
        afficheTab(T_impair, "Tableau T_impair (impairs)");
    }
}
