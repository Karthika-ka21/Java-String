import java.util.Scanner;
public class RemovalOfDuplicates {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a String");
    String s1=sc.nextLine();
    String s2="";
    for(int i=0;i<s1.length();i++){
        if(s2.indexOf(s1.charAt(i))==-1)
        s2+=s1.charAt(i);
    }
    System.out.println(s2);
}
}
