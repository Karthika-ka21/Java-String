import java.util.Scanner;

public class Encoding {
    static String encode(String s,int level){
        char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] a=s.toCharArray();
        String res="";
        for(int i=0;i<a.length;i++){
            int index=a[i]-'a';
            index+=level;
            index%=alpha.length;
            res+=alpha[index];

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        System.out.println("enter encoding level");
        int level=sc.nextInt();
        System.out.println(encode(str, level));
    }
}
