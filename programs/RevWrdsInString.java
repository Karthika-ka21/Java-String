import java.util.Scanner;

public class RevWrdsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String s1 = sc.nextLine();
        String s2 = reverse(s1);
        System.out.println(s2);
    }

    static String reverse(String s) {
        
        char[] a = s.toCharArray();
        int i = a.length - 1;
        int j = a.length - 1;
        String s2 = "";
        while (i >= 0) {
            String t = "";
            while (i >= 0 && a[i] != ' ')
                i--;

            for (int k = i + 1; k <= j; k++)
                t += a[k] + "";
            s2+=t;
            if(i>=0) s2+=" ";
            i--;
            j = i;
        }
        return s2;

        // using split()
        // String[] s2=s.split(" ");
        // String s3="";
        // for(int i=s2.length-1;i>=0;i--){
        //     s3+=s2[i];
        //     if(i>0) s3+=" ";
        // }
        //return s3;
    }
}
