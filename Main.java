
import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String str = sc.nextLine();



         Hashcode obj = new Hashcode();
         System.out.println("Hash value of your name is :");
         obj.hashcode(str);
       


       
    }
}