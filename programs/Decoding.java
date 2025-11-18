import java.util.Scanner;

public class Decoding {
    static String decode(String s, int decLevel){
        char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] a=s.toCharArray();
        String res="";
        for(int i=0;i<a.length;i++){
            int index=a[i]-'a';
            index-=decLevel;
            if(index<0)
                index=alpha.length+index;
            res+=alpha[index];
        }
        return res;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        System.out.println("enter decoding level");
        int level=sc.nextInt();
        System.out.println(decode(str, level));
    }
}
