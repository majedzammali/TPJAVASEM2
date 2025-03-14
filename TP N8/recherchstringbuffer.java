import java.util.Scanner;

class recherchstringbuffer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String  mot1, mot2; 
            StringBuffer text;
            int l, p;
            System.out.println("donner un text");
            text = new StringBuffer(scanner.nextLine());
            System.out.println("donner un mot1");
            mot1 = scanner.nextLine();
            System.out.println("donner un mot2");
            mot2 = scanner.nextLine();

            if (text.indexOf(mot1.toString()) == -1) {
                System.out.println("mot1 n'exist pas dans text");
            } else {
                l = mot1.length();
                while ((p = text.indexOf(mot1.toString())) != -1) {
                    text.replace(p, p + l, mot2.toString());
                }
                System.out.println("le noveau text est: " + text);
            }
        }
    }
}