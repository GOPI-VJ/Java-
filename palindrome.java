import java.util.*;
public class palindrome {
    public boolean isPalindrome(String s) {
        String string1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = string1.length() - 1;
        while (start < end) {
            if (string1.charAt(start) != string1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        palindrome solution = new palindrome();
        System.out.println(solution.isPalindrome(inputString));
    }
}
