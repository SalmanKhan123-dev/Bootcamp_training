import java.util.Scanner;
public class second{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
        //    char ch=Character.toLowerCase(str.charAt(i));
           if(str.charAt(i)=='a'||str.charAt(i)=='A'){
            count++;
           }
        }
     System.out.println("Number of A's in your string are " + count);

    }
    
}
