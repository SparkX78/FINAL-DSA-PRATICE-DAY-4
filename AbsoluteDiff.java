import java.util.*;
public class AbsoluteDiff {
    public static int[] DiffArray(int[] nums){
        int rightSum = 0;
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];

        }
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            rightSum -= value;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += value;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2, 4, 5, 8, 10};
        int[] result = DiffArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
