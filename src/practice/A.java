package practice;

import common.test;

import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args){
        String str = "top,pot,di,maxs,otp,id,pot,di,piti";
        String[] arr = str.split(",");
        HashSet<String> hs = new HashSet<>();
        HashMap<String,String> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String val = it.next();
            char[] chars = val.toCharArray();
            Arrays.sort(chars);
            String sortedVal = new String(chars);
            hm.put(val,sortedVal);
        }
        System.out.println("aaa");
    }
}

