import java.util.Scanner;

class DisplayConsecutiveChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (str.charAt(i + 1) == c)
                System.out.print(c + " ");
        }
    }
}
