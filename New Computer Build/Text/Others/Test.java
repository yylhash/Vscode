package Others;

import java.util.Stack;

public class Test {

    public int[] removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        for( int i = 0; i < len; i++) {
            for(int j = i + 1 ;j < len - 1; j++) {
                if(nums[i] != nums[j]) {
                    // count++;
                    break;
                } else {
                    nums[j] = nums[j+1];
                }
            }
        }
        // for(int i = 0; i < nums.length-1; i++) {
        //     if(nums[i] != nums[i+1]) {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        return nums;
    }
    public static void main(String[] args) {
        int  []nums = {0,0,1,1,1,2,2,3,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        Test test = new Test();
        int count = 1;
        for(int i = 0; i < nums.length; i++) {
            System.out.print(test.removeDuplicates(nums)[i]);
        }
    }
}
