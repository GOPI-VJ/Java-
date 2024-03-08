import java.util.*;
public class Max_Area {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            if (height[start] < height[end]) {
                maxArea=Math.max(maxArea,height[start]*(end-start));
                start++;
            } else {
                maxArea=Math.max(maxArea,height[end]*(end-start));

                end--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of walls: ");
        int n = scanner.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the heights of the walls:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }
        Max_Area solution = new Max_Area();
        int maxArea = solution.maxArea(height);
        System.out.println(maxArea);

    }
}
