package dingzheng;

import java.util.Arrays;

public class XuanZePaiXu {
    public static void main(String[] args) {
        int[] arr = {3,4,18,98,45,27};
        for(int i=0;i< arr.length-1;i++){
            int min = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("升序排列后："+ Arrays.toString(arr));
    }
}
