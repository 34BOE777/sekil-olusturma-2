import java.util.Scanner;

public class cu{    
    public static void main(String[] args){ 
       System.out.println("Kaç satır girecen ?");
       try (Scanner s = new Scanner(System.in)) {
        int n=s.nextInt();
           for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
           }
          
           
    }


    }
}
