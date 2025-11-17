import java.util.Scanner;

class NextVowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str =sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<'e') res+='e';
            else  if(str.charAt(i)<'i') res+='i';
            else  if(str.charAt(i)<'o') res+='o';
            else  if(str.charAt(i)<'u') res+='u';
            else System.out.println("no vowel after u");
        }
        System.out.println(res);
    }
}
