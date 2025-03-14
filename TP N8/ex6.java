
  import java.util.Scanner;
class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p_a=0,p_c=0,p_i=0,p_o=0,p_u=0,p_y=0;
        int i;
        System.out.println("donner un mot");
        String mot =scanner.nextLine();
        for(i=0; i<mot.length(); i++){
            char ch = mot.charAt(i);
            if (ch=='a') {
                p_a++;
            }else if (ch=='c'){
                p_c++;
            }else if (ch=='i'){
                p_i++;
            }else if(ch=='o'){
                p_o++;
            }else if (ch=='u'){
                p_u++;
            }else if(ch=='y'){
                p_y++;
            }
        }
        System.out.println(p_a+" "+p_c+" "+p_i+" "+p_o+" "+p_u+" "+p_y);
    
    
    }
}

