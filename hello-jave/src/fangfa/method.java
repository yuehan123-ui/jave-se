package fangfa;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        // 定义一个方法 求1-n 的和 并返回
        System.out.println("请输入n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        add(n);
        System.out.println(add(n));
    }
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum +=i;
        }
        return sum;
    }
}
