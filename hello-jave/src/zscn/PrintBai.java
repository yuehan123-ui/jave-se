package zscn;

import java.util.Scanner;
//  ALT + 回车  修改文件名
public class PrintBai {
    public static void main(String[] args) {
        //利用三元运算符 求三个整数的最大值
        int a = 10;
        int b = 20;
        int c = 30;
        int x = a > b ? a : b;
        int rs = x > c ? x:c;
        System.out.println(rs);

        int max = a > b? (a>c?a : b) :(b >c ? b : c);
        System.out.println(max);
        Scanner in = new Scanner(System.in);
        String age = in.next();
    }
}
