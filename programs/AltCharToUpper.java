import java.util.Scanner;
 class AltCharToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                char c=s1.charAt(i);
                s1=s1.replace(c+"",(c+"").toUpperCase());
                
            }
            else 
            {
                char c=s1.charAt(i);
                s1=s1.replace(c+"",(c+"").toLowerCase());
            }
            
        }
        System.out.println(s1);
    }
}
