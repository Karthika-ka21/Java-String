import java.util.Scanner;

class BalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        if (isBalanced(str))
            System.out.println("String is balanced");
        else
            System.out.println("String is not balanced");
    }

    static boolean isBalanced(String s) {
        s = removeChars(s);
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.length() == 0;
    }

    static String removeChars(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == ']' || c == '(' || c == ')' || c == '{' || c == '}') {
                res += s.charAt(i);
            }
        }
        return res;

    }
}
