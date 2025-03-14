import java.util.Scanner;
public class EXN1 { 
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
    public static void main(String[] args) {
        int[] entiers = new int[10];
        System.out.println("Entrez 10 entiers :");
        for(int i = 0; i < 10; i++){
            entiers[i] = lectureN();
        }
        System.out.println("Les entiers sont :");
        for(int n : entiers){
            if(EstPair(n)==true){
                System.out.println(n);
            }
        }
    }
}