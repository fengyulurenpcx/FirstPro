package dingzheng;

import java.util.Arrays;

public class ChaRuPaiXu {
    public static void main(String[] args) {
        int[] arr ={67,65,124,64,23};
        for(int i = 1;i< arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && temp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j!=i){
                arr[j] = temp;
            }
        }
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
