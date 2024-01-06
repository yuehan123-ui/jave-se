package fangfa;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        //定义一个方法 判断奇偶
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        panduan(n);
    }
    public static void panduan(int n){
        if(n%2==0)
            System.out.println(n + "是偶数");
        else
            System.out.println(n + "是奇数");
    }
}
