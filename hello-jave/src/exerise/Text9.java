package exerise;

import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {
        //运用字符串API实现手机号码屏蔽中间四位（132 **** 5811）

        //截取前三位和后四位 然后拼接****
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的手机号");
        String phonenum = in.next();

        String first  =phonenum.substring(0,3);
        String last = phonenum.substring(7,11);
        System.out.println(first + "****" + last);
    }
}
