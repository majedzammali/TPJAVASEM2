public class ex5tableau {
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int referenceLength = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != referenceLength) return false;
        }
        return true;
    }
    
    public static double[] sommelignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (double valeur : t[i]) {
                sommes[i] += valeur;
            }
        }
        return sommes;
    }
    
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length || 
            t1.length == 0 || t1[0].length != t2[0].length) return null;
        
        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }
    
    public static void main(String[] args) {
        double[][] array1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] array2 = {{0.5, 1.5}, {2.5, 3.5}};
        
        System.out.println("Array 1:");
        affiche(array1);
        
        System.out.println("Array 2:");
        affiche(array2);
        
        System.out.println("Sum of arrays:");
        double[][] result = somme(array1, array2);
        affiche(result);
    }
}
