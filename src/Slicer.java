
import java.util.Scanner;

public class Slicer {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email id:");
        String s=sc.next();
        
       if(s.indexOf('@')!= -1)
       {
            int n=s.indexOf("@");
        int x=n+1;
        System.out.println("The user name is:");
        System.out.println(s.substring(0,n));
        System.out.println("The domain name is");
        System.out.println(s.substring(x));
       }
       else
       {
           System.out.println("The email address is not correct");
       }
        
    }
    
}
