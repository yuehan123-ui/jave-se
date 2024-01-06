package fangfa;

import java.security.spec.RSAOtherPrimeInfo;

public class Method4 {
    //打印数组的值
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        print(arr);

    }
    public static void print(int [] arr){
        System.out.print("[");
        if(arr!=null&&arr.length>0)
        for (int i = 0; i < arr.length; i++) {
          //  if(i == arr.length-1){
            //System.out.print(arr[i] );}
           // else
             //   System.out.print(arr[i]+",");
            System.out.print(i == arr.length-1? arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
