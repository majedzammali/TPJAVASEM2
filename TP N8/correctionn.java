import java.util.Scanner;

public class correctionn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mot1, mot2, ch;
        int l1 , l2, pos;
        StringBuffer text ;
        do {
            System.out.println("donner une chaine ne dépasse pas 50 caracteres");
            ch=sc.nextLine();
        } while (ch.length()>50);
        do {
            System.out.println("donner le mot1 ne dépasse pas 10 caracteres");
            mot1= sc.nextLine();
            System.out.println("donner le mot2 ne dépasse pas 10 caracteres");
            mot2= sc.nextLine();
        } while ((mot1.length()>10 )|| (mot2.length()>10));
        text= new StringBuffer(ch);
        l1= mot1.length();
        l2= mot2.length();
        while (text.indexOf(mot1) != -1) {
            pos= text.indexOf(mot1);
            text= text.delete(pos , pos+l1);
            text=text.insert(pos,mot2);
        }
        System.out.println(text);



    }

}
