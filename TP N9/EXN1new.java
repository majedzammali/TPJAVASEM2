import java.util.Scanner;
public class EXN1new {
    public static void main(String[] args) {
        int[] entiers = new int[10];
        System.out.println("Entrez 10 entiers :");
        for(int i = 0; i < 10; i++){
            entiers[i] = methode.lectureN();
        }
        System.out.println("Les entiers sont :");
        for(int n : entiers){
            if(methode.EstPair(n)==true){
                System.out.println(n);
            }
        }
    }
}
