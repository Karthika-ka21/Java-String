 //import java.util.Arrays;
 import java.util.Scanner;
 class Anagram {
    static boolean isAnagram(String s1,String s2){
        while (s1.length()==s2.length()) {
            if(s1.length()==0&&s2.length()==0)
                return true;
            char c=s1.charAt(0);
            s1=s1.replace(c+"","");
            s2=s2.replace(c+"",""); 
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first String");
        String s1=sc.nextLine();
         System.out.println("enter second String");
        String s2=sc.nextLine();
        if(isAnagram(s1, s2)) System.out.println("2 words are anagram");
        else System.out.println("2 words are not anagram");
         
        // char[] a1=s1.toCharArray();
        // char[] a2=s2.toCharArray();
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // if(Arrays.equals(a1,a2)){
        //    System.out.println("Both words are anagram to each other");
        // }
        // else
        //     System.out.println("Not Anagram");


        
       
    }
}
