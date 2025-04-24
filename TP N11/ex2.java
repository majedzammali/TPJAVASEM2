import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int som;
        som=0;
        double moy = 0.0;
        int nb = nombernote(null, som, moy);
        System.out.print("Entrez la taille du tableau: ");
        int n = sc.nextInt();
        while (n>=10) {
            System.out.println("donner 2");
            n=sc.nextInt(); 
        }
        int[] tab=new int[n];
        remplirTab0to20(tab, sc,n);
        System.out.println("Tableau initial:");
        for (int i = 0; i < n; i++){
          som=som+tab[i];  
        }
        moy = calculmoy(som, n, 0);
        System.out.println("La moyenne est: " + moy);

    }
    public static int remplirTab0to20(int[] tab, Scanner sc,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez un entier: ");
            int note = sc.nextInt();
            while (note <= 0 || note >= 20) {
                System.out.print("La note doit être entre 0 et 20. Réessayez: ");
                note = sc.nextInt();
            }
            tab[i] = note;
        }
        return 0;
    }
    public static double calculmoy(int som ,int n,double moy) {
        moy=som/n;
        return moy;
    }
    public static int nombernote(int[] tab, int n, double moy) {
       int count = 0;
       for (int i = 0; i < n; i++) {
        if (tab[i] > moy){
            count++;
        }
       }
       return count; 

}}
