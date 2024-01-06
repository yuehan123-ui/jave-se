package exerise;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        //运用方法实现买飞机票

        Scanner in = new Scanner(System.in);
        System.out.println("请依次输入机票原价，月份和头等舱或经济舱");
        double price = in.nextDouble();
        int month = in.nextInt();
        String train = in.next();
        double x =calculate(price,month,train);
        System.out.println(train+"票价为"+x);

    }
    public static double calculate(double price,int month,String train) {
        if(month<=10&&month>=5) {
            switch (train){
                case "头等舱":
                    price *=0.9;
                    break;
                case "经济舱":
                    price *=0.85;
                    break;
                default:
                    System.out.println("类型输入有误");
                    price = -1;
            }
        }else if(month==11||month==12||month<=4&&month>=1){
            switch(train){
                case "头等舱":
                    price *=0.7;
                    break;
                case "经济舱":
                    price *=0.6;
                    break;
                default:
                    System.out.println("类型输入有误");
                    price = -1;
            }
        }else {
            System.out.println("月份输入有误");

        }
        return price;
        }

}
