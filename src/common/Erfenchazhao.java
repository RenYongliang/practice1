package common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Erfenchazhao {


    public static void main(String[] args) {
        int[] arr = {0,2,3,6,8,9};
        int x = 7;
        System.out.println(erfen(arr,x));
    }

    public static int erfen(int[] arr,int x){
        int start = 0;
        int end = arr.length-1;
        do{
            int mid = (start+end)/2;
            if(x == arr[mid]){
                return mid;
            }else if(x>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }while(start<=end);

        return -1;
    }
}
