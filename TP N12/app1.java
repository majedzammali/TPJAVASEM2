import java.util.Scanner;
public class app1 {
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
    
    public static int sommr_rec(int n ){
        if (n==0) {
            return 0;
        } else {
            return  n+ sommr_rec(n-1);
            
        }
    }
    
    public static void main(String[] args) {
        int n = lecture();
        int s = sommr_rec(n);
        System.out.println("la somme de 1 a "+ n + " est :"+s);
    }
}