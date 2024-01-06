package exerise;

import java.util.Scanner;

public class Text8 {
    public static void main(String[] args) {
        //模拟用户名登陆系统
        String okname = "admin";
        String okpasssword = "123456";

        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String name = in.next();
        System.out.println("请输入您的密码");
        String password = in.next();

        for (int i = 1; i <=3 ; i++) {
            if (okname.equals(name)){
                if(okpasssword.equals(password)){
                    System.out.println("登陆成功");
                    break;
                }else {
                    System.out.println("您的密码错误");
                }
            }else{
                System.out.println("您的用户名错误");
            }
        }
    }
}
