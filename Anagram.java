import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s", "").toLowerCase();
        String s2 = t.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    }

