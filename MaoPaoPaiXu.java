package dingzheng;

import java.util.Arrays;

public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i=0;i< nums.length;i++){
            nums[i] = (int)(Math.random()*100);
        }
        for(int i = 0;i< nums.length-1;i++){
            for(int j = 0;j< nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("升序排列后："+ Arrays.toString(nums));
    }
}
