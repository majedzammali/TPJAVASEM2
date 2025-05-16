import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
         String ch;
         String[][] mat = new String[5][5];
          System.out.println("donner un chaine");
          ch = sc.next();
          System.out.println(Convertir(ch));
          String aff = Affichage(mat);
          System.out.println(aff);
          sc.close();
        }
    }
    public static double Convertir(String ch){
        return Double.parseDouble(ch);
    }
    
    public static String Affichage(String[][] mat) {
        String result = "";
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                result += mat[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
