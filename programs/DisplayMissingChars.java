import java.util.Scanner;

public class DisplayMissingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character String");
        String str =sc.nextLine();
        String res="";
        for(int i=0;i<str.length()-1;i++){

            char c=str.charAt(i);
            do{
                if(str.indexOf(c)==-1){
                    res+=c;
                }
                c++;
            }while(c>str.charAt(i)&&c<str.charAt(i+1));
           
        }
        System.out.println(res);
    }
}
