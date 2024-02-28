import java.util.*;

public class Duplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] nums = new int[length];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Does the array contain any duplicates? " + containsDuplicate(nums));
        
        scanner.close();
    }
}
