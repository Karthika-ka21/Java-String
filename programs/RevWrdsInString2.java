import java.util.Scanner;

class RevWrdsInString2 {
    static String reverseWord(String s){
        char[] a=s.toCharArray();
        int i=0,j=0;
        while(i<a.length){
            while(i<a.length&&a[i]!=' ')
                i++;
            for(int k=j;k<i;k++){
                char temp=a[j];
                a[j]=a[k];
                a[k]=temp;
            }
            i++;
            j=i;
        }
        return new String(a);

        //using split()
        // String[] s1=s.split(" ");
        // String s2="";
        // for(int i=0;i<s1.length;i++){
        //     char[] a=s1[i].toCharArray();
        //     for(int j=0,k=a.length-1;j<k;k++){
        //         char temp=a[j];
        //         a[j]=a[k];
        //         a[k]=temp;
        //     }
        //     s2+=new String(a)+" ";
        // }
        // return s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String s1 = sc.nextLine();
        String s2=reverseWord(s1);
        System.out.println(s2);
    }
    
}
