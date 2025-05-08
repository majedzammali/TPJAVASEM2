import java.util.Scanner;
public class ex3tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = ex1.lecturen(sc);
        int []t=new int[n];
        System.out.println("tableau initial");
        remplir(t);
        System.out.println("tableau iitial<<");
        affich(t);
        System.out.println("");
        tri(t);
        System.out.println("tableau iitial<<");
        affich(t);
        sc.close();
    }
    static void remplir(int[] t) {
       Scanner sc = new Scanner(System.in);
       System.out.println("donner ..");
       for (int i = 0; i < t.length; i++) {
          t[i]=sc.nextInt();
       }
       sc.close();
    }
    
    static void tri(int[] t) {
        int aux;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i]>t[j]) {
                    aux=t[i];
                    t[i]=t[j];
                    t[j]=aux;
                }
            }
        }
    }
    static void affich (int []t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]+"");
        }
    }

}
