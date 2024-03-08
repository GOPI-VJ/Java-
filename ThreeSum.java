import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            
            int target = -nums[i];
            int start= i + 1, end = nums.length - 1;
            
            while (start < end) {
                int sum = nums[start] + nums[end];
                
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) start++; // Skip duplicates
                    while (start < end && nums[end] == nums[end - 1]) end--; // Skip duplicates
                    start++;
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        ThreeSum solution = new ThreeSum();
        List<List<Integer>> triplets = solution.threeSum(nums);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
            }
}
