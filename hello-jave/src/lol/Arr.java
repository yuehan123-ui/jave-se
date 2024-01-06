package lol;

public class Arr {
    public static void main(String[] args) {
         //数组遍历 ；访问数组中每一个数据
        int [] arr = {33,34,35};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         //求数组中最大值
        System.out.println("-------------");
        int [] age = {32,12,45,49,78,46};
        int max = age[0];
        for (int i = 1; i < age.length; i++) {
            if(age[i]>max)
                max = age[i];

        } System.out.println("最大值"+max);
        System.out.println("-----------");
        for (int i = 1; i < 5; i++) {

            if(i==3)
                continue;
            else
                System.out.println(i);
        }
    }
}
