package zscn;

import java.util.Scanner;

public class wdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
        System.out.println("请选择要计算的图形类型：");
        System.out.println("1.计算矩形的面积和周长");
        System.out.println("2.计算圆的面积和周长");
        System.out.println("3.计算三角形的面积和周长");
        System.out.println("4.退出");
            int num = in.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("请输入矩形的长和宽");
                    double chang = in.nextDouble();
                    double kuan = in.nextDouble();
                    Shape x = new rectangle(chang, kuan);
                    System.out.println("面积为" + x.mianji() + "周长为" + x.zhouchang());
                }
                case 2 -> {
                    System.out.println("请输入圆形的半径");
                    double banjing = in.nextDouble();
                    Shape y = new circle(banjing);
                    System.out.print("面积为:");
                    System.out.printf("%.2f%n", y.mianji());
                    System.out.print("周长为:");
                    System.out.printf("%.2f%n", y.zhouchang());
                }
                case 3 -> {
                    System.out.println("请输入三角形的三条边长");
                    double bianchang1 = in.nextDouble();
                    double bianchang2 = in.nextDouble();
                    double bianchang3 = in.nextDouble();
                    Shape z = new triangle(bianchang1, bianchang2, bianchang3);
                    System.out.println("面积为" + z.mianji() + "周长为" + z.zhouchang());
                }
                case 4 -> System.exit(0);
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }
}
abstract class Shape{       //抽象父类
    abstract double zhouchang();
    abstract double mianji();
}
class circle extends Shape {           //圆形
    double banjing;
    public circle(double banjing) {
        this.banjing = banjing;
    }
    double mianji() {
        return Math.PI * banjing *banjing;
    }
    double zhouchang() {
        return 2 * Math.PI *banjing;
    }
}
class rectangle extends Shape{      //矩形
    double chang;
    double kuan;
    public  rectangle(double chang,double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }
    double mianji() {
        return chang * kuan;
    }
    double zhouchang() {
        return (chang+kuan)*2;
    }
}
class triangle extends Shape{   // 三角形
    double bianchang1;
    double bianchang2;
    double bianchang3;
    public triangle(double bianchang1,double bianchang2,double bianchang3) {
        this.bianchang1 = bianchang1;
        this.bianchang2 = bianchang2;
        this.bianchang3 = bianchang3;
    }
    double zhouchang() {
        return bianchang1+bianchang2+bianchang3;
    }
    double mianji() {//海伦公式
        double  l = (bianchang1 + bianchang2 + bianchang3) / 2;
        return Math.sqrt(l*(l - bianchang1)*(l - bianchang2)*(l - bianchang3));
    }
}