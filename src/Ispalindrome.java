import java.util.Scanner;

public class Ispalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int count=0;
        int n=a.length();
        for (int i=0;i<n;i++){
            if(a.charAt(i)== a.charAt((n-1)-i)){
                count++;
            }
        }
        if (count==n){
            System.out.println("THe given string is palindrome");
        }else{
            System.out.println("The given string is not plaindrome");
        }
    }
}
