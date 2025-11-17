import java.util.Scanner;
class ReplaceWithoutMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str =sc.nextLine();
        String res="";
        System.out.println(" enter what you want to replace and replacing value");
        String sold=sc.nextLine();
        String snew=sc.nextLine();
        char[] a=str.toCharArray();
        char[] b=sold.toCharArray();
        char[] c=snew.toCharArray();
        for(int i=0;i<a.length;i++){
            int j;
            for( j=0;j<b.length && i+j<a.length &&a[i+j]==b[j];j++);
            if(j==b.length){
                for(int k=0;k<c.length;k++){
                    res+=c[k];
                }
                i=i+b.length-1;
            }
            
            else{
                res+=a[i];
            }
        }
        if(res.equals(str)){
            System.out.println("sorry expected string not found");
        }
        else System.out.println(res);
    }
}