import java.util.Scanner;

public class ex1 {
    public static int remplirTab(int[] tab, Scanner sc) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez un entier: ");
            tab[i] = sc.nextInt();
        }
        return 0;
    }
    
    public static int remplac(int[] tab, int n, int x1, int x2) {
        for (int i = 0; i < n; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
        return 0;
    }
    
    public static void afficherTab(int[] tab) {
        System.out.print("Tableau: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    
    public static int lecturen(Scanner sc) {
        int n;
        while (true) {
            System.out.println("donner un entier strictement positif");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    return n;
                }
            } else {
                System.out.println("Erreur: Veuillez entrer un nombre entier valide.");
                sc.next(); 
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lecturen(sc);
        int[] tab = new int[n];
        remplirTab(tab, sc);
        System.out.println("Tableau initial:");
        afficherTab(tab);
        
        System.out.println("Entrez la valeur à remplacer (x1):");
        int x1 = lecturen(sc);
        System.out.println("Entrez la nouvelle valeur (x2):");
        int x2 = lecturen(sc);
        
        remplac(tab, n, x1, x2);
        System.out.println("Tableau après remplacement:");
        afficherTab(tab);
        
        sc.close();
    }
}