package lol;

import java.util.Random;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        //将数组中的数据进行随机排序
        int[] no = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < no.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            int x = in.nextInt();
            no[i] = x;
        }
        Random xn = new Random();
        for (int i = 0; i < no.length; i++) {
            int y = xn.nextInt(no.length);
            int z = no[y];
            no[y]=no[i];
            no[i]=z;
        }
        for (int i = 0; i < no.length; i++) {
            System.out.print(no[i]+"\t");
        }
    }
}
