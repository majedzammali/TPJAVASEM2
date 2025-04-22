import java.util.Scanner;
public class test {
    public static int lecturen(Scanner scanner){
        int n;
        while (true) {
            System.out.println("donner un entier strictement positif");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                }
            } else {
                System.out.println("Erreur: Veuillez entrer un nombre entier valide.");
                scanner.next(); 
            }
        }
    }
       
       public static int compter(int n) {
        int h = 0;
        while (n > 0) {
            h++;
            n = n/ 10;
        }
        return h;
       }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= lecturen(scanner);
        int h= compter(n);
        int a=lecturen(scanner);
        int b=lecturen(scanner);
        String ch;
        int add=addition(a,b);
        int sou=soustraction(a, b);
        int mul=multiplication(a, b);
        int dev=division(a, b);
         System.out.println("les nomber de chiffer est "+ h);
         System.out.println("l'addition ="+ add+"  la soustraction ="+sou+"  multiplication ="+mul+"  la division ="+dev);
         do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            ch = scanner.nextLine().trim().toLowerCase();
            if (!estInf(ch)) {
                System.out.println("Ce verbe n'est pas à l'infinitif. Réessayez.");
            }
        } while (!estInf(ch));
        String groupe = Groupe(ch);
        System.out.println("Le verbe " + ch + " appartient au " + groupe);
        scanner.close();
       }
        public static int addition(double a, double b) {
        return (int) (a+b);}
        public static int soustraction(double a, double b) {
        return (int) (b-a);}
        public static int multiplication(double a, double b) {
        return (int) (a*b);}
        public static int division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur: Division par zéro.");
            return 0; 
        }
        return (int) (a/b);}
        public static boolean estInf(String ch){
            return ch.endsWith("er") || ch.endsWith("ir") || ch.endsWith("re") || ch.endsWith("oir");}
        public static String Groupe(String ch) {
            if ((ch.equals("aller"))||(ch.equals("faire"))||(ch.equals("savoir"))) return "3e groupe";
            if (ch.endsWith("er")) return "1er groupe";
            if (ch.endsWith("ir")) return "2e groupe ";
            return "3e groupe";
        }
        
        
}
