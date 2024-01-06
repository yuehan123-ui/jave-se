package exerise;

import java.util.Scanner;

public class Text1 {
    //买飞机票

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请依次输入机票原价，月份和头等舱或经济舱");
        double price = in.nextDouble();
        int month = in.nextInt();
        String train = in.next();

        double price1, price2;
        if (month <= 10 && month >= 5) {//旺季
            System.out.print("旺季" + "\t");
            if (train.equals("头等舱")) {
                price1 = price * 0.9;
                System.out.println("头等舱票价为" + price1);
            } else if (train.equals("经济舱")) {
                price2 = price * 0.85;
                System.out.println("经济舱票价为" + price2);
            } else {
                System.out.println("输入有误，请重新输入！");
            }
        } else if (month > 12) {
            System.out.println("输入有误，请重新输入");
        } else {
            System.out.println("淡季");
            if (train.equals("头等舱")) {
                price1 = price * 0.7;
                System.out.println("头等舱票价为" + price1);
            } else if (train.equals("经济")) {
                price2 = price * 0.65;
                System.out.println("经济舱票价为" + price2);
            } else {
                System.out.println("输入有误，请重新输入！");
            }
        }
    }
}
