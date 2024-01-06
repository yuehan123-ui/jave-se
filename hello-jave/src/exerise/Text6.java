package exerise;

import java.util.Scanner;

public class Text6 {
    public static void main(String[] args) {
        //录入六名评委所打分数
        int [] arr = new int[6];
        Scanner in = new Scanner(System.in);
        System.out.println("请输入六位评委所打的评分");
        for (int i = 0; i < arr.length; i++) {
            int score = in.nextInt();
            arr[i] = score;
        }
        //找出最大值最小值
        int max = max(arr);
        int min = min(arr);
        int sum = 0;
        //遍历数组 求出六个分数的总和
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        //总分减去最值 求平均值
        double fenshu= (double)(sum - max -min)/ (arr.length-2);
        System.out.println("最终分数为"+fenshu);

    }
    //定义两个方法 求数组最值
    public static int max(int [] arr1){
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i]>max){
                max = arr1[i];
            }
        }return max;
    }
    public static int min(int [] arr2){
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if(arr2[i]<min){
                min = arr2[i+1];
            }
        }return min;
    }
}
