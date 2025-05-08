import java.util.Scanner;
public class app2 {
    public static int lecture(){
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("donne un entier positif");
                while (!sc.hasNextInt()) {
                    System.out.println("Ce n'est pas un nombre! Réessayez:");
                    sc.next();
                }
                n = sc.nextInt();
            } while (n <= 0);
            return n;
        }
    }
    public static int factoriel(int n ){
        if (n==0) {
            return 1;
        } else {
            return  n* factoriel(n-1);
            
        }
    }
    public static void main(String[] args) {
        int n = lecture();
        int f = factoriel(n);
        System.out.println("la factoriel de n est egal :"+f);
    }
}
