package lol;

import java.util.Random;
import java.util.Scanner;

//  利用数组存储数据实现猜数游戏
public class hero {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Random in = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt(20)+1;
    }
    Scanner xn = new Scanner(System.in);
    System.out.println("请输入一个数据:");
    OUT:
    while (true)
    {
      int x = xn.nextInt();
      for (int i = 0; i < arr.length; i++) {
        if(x == arr[i]) {
          System.out.println("猜对了");
          break OUT;
        }
      }
      System.out.println("请重新输入");
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }
  }
}


