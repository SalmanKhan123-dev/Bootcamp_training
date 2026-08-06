import java.util.Scanner;
public class first{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
           char ch=Character.toLowerCase(str.charAt(i));
           if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
            count++;
           }
        }
     System.out.println("Number of vowels in your string are " + count);

    }
    
}
