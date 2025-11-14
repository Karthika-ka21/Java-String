import java.util.Scanner;

class EliminateSpace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s1=sc.nextLine();
        String res="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                res+=s1.charAt(i);
            }

        }
        System.out.println(res);
    }
}