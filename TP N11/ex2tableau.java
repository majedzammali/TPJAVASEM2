import java.util.*;
public class ex2tableau {
    static float prod_scal (float[] tab1 , float[] tab2 , int n1 , int n2) {
        if (n1 != n2) {
            return 0 ;
        }
        else {
            float s = 0 ;
            for (int i = 0 ; i < n1 ; i++ ) {
                s = s + ( tab1[i]*tab2[i]);
            }
            return s ;
        }
        }
    static void produit (float[] tab1 , float[] tab2 , int n1 , int n2) {
        if (n1 != n2) {
            System.out.println("nulle "); ;
        }
        else {
            float [] tab_p = new float[10000];
            for (int i = 0 ; i < n1 ; i++) {
                tab_p[i] = tab1[i]*tab2[i];
            }
            System.out.println("le tableau de produit de deux tableaux précédent est : ");
            for (int i = 0 ; i< n1 ;i++) {
                System.out.print(tab_p[i] + "|");
            }
        }
    }
    static void somme (float[] tab1 , float[] tab2 , int n1 , int n2) {
        if (n1 != n2) {
            System.out.println("nulle "); ;
        }
        else {
            float [] tab_s = new float[10000];
            for (int i = 0 ; i < n1 ; i++) {
                tab_s[i] = tab1[i]+tab2[i];
            }
            System.out.println("le tableau de somme de deux tableaux précédent est : ");
            for (int i = 0 ; i< n1 ;i++) {
                System.out.print(tab_s[i] + "|");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("entrer n1 :");
        int n1 = sc.nextInt();
        System.out.println("entrer n2 :");
        int n2 = sc.nextInt();
        float [] tab1 = new float [1000];
        float [] tab2 = new float [1000];
        for(int i = 0  ; i < n1 ; i++) {
            System.out.println("remplir tab1[" + i + "] = ");
            tab1[i] = sc.nextFloat();
        }
        for(int i = 0  ; i < n2 ; i++) {
            System.out.println("remplir tab2[" + i + "] = ");
            tab2[i] = sc.nextFloat();
        }
        System.out.println("le produit scalaire de tab1 et tab2 est : " + prod_scal(tab1,tab2,n1,n2));
        produit(tab1,tab2,n1,n2);
        System.out.println("");
        somme(tab1,tab2,n1,n2);
        sc.close();
    }

}