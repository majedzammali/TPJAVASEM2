import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            int nl,nc,i,j,x;
            int[][] m = new int[50][50];
            do {
                System.out.println("donner nl");
                nl= scanner.nextInt();
                System.out.println("donner nc");
                nc= scanner.nextInt();
                System.out.println("donner de taille < 50");
            }  while (  nl > 50 || nc > 50);
              
               for( i=0; i<nl; i++ ){
                for(j=0;j<nc;j++){
                   do {
                    System.out.println("M["+i+","+j+"]");
                   m[i][j] = scanner.nextInt();
                   } while ((m[i][j]%2)!=0 );
                   
                }
            }
            System.out.println("donner un nomber x");
            x= scanner.nextInt(); 
            for( i=0; i<nl; i++ ){
                for(j=0;j<nc;j++){
                    if (m[i][j]==x) {
                        System.out.println("x existe");
                        
                    }
                    else {
                        System.out.println("x ne pas existe");
                    }
                }
            }
        }
    }
}