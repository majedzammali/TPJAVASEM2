import java.util.Scanner;

public class methode {
    public static void main(String[] args) {
    }
    
    public static boolean EstPair (int n){
        return n%2==0;
    }
    
    public static int lectureN (){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("entrez un entier strictement positif  :");
            while(!scanner.hasNextInt()){
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
            }
            n= scanner.nextInt();
            if(n <= 0){
                System.out.println("Erreur : L'entier doit etre strictement positif .");
            }
        }while(n <= 0);
        return n;
    }
    public static int compter (int n){
        int nomberchiffer = 0;
        while (n != 0) {
            n = n / 10;
            nomberchiffer++;
        }
        return nomberchiffer;
    }
}