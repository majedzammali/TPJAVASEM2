import java.util.Scanner;
public class APP2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        StringBuffer ch1;
        var ch2=" ";
        int yo;
        var ;
        do {
            System.out.print("Enter ch1 (1-29 characters): ");
            ch1 = new StringBuffer(scanner.nextLine());
        } while (ch1.length() <= 0 || ch1.length() >= 30);
        for (int i = 0; i < ch1.length(); i++) {
            char c = ch1.charAt(i);
            yo = c+3;
            y = int(yo);
            ch2 += yo;


        }
        System.out.println( ch1);
        scanner.close();
    }
}