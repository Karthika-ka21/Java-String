import java.util.Scanner;

class CaseConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                str=str.replace(c,(char)(c - 32));
                
            }
            else  if (c >= 65 && c <= 90) {
                str=str.replace(c,(char)(c - 32));
                
            }
        }
        System.out.println(str);
    }

}
