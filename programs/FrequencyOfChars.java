 import java.util.Scanner;
 class FrequencyOfChars {
    public static void main(String[] args) {
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        String temp=s1;
        while (s1.length()>0){
          char c=s1.charAt(0);
          String  s2= s1.replace(c+"","");
          count=s1.length()-s2.length();
          System.out.println(c+"="+count);
          s1=s2;

        }
        /* to display repeating characters
          s1=temp;
         while (s1.length()>0){
          char c=s1.charAt(0);
          String  s2= s1.replace(c+"","");
          if(s1.length()-s2.length()>1)
          System.out.print(c+" ");
          s1=s2;

        }
         */
        
    }
}
