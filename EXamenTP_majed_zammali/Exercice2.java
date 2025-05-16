import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            String[][] vol= {{"num vol","vdep","vdest","codeav","classAv","prixvol"},
            {"1","Tozeur","djerba","Ab01","A1","156"},
            {"2","Tozeur","Tunis","Ab02","A2","250"},
            {"3","Tunis","djerba","Ab03","A1","140"},
            {"4","djerba","sfax","Ab04","A2","120"}};
            String J =Exercice1.Affichage(vol);
            System.out.println("le tableau est :" + J);
            for(int i = 1; i < vol.length; i++) {
                double price = Exercice1.Convertir(vol[i][5]);
                price = price * 0.8; 
                vol[i][5] = String.valueOf(price);
            }
            
            System.out.println("Tableau apres remise:");
            String K=Exercice1.Affichage(vol);
            System.out.println("le tableau est :" + K);  
        }
        sc.close();
    }
}
