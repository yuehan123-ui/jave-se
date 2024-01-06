package exerise;

import java.util.Random;

public class Text4 {
    public static void main(String[] args) {
        //随机生成n位数验证码
        int n =5;
        System.out.println(MakeCode1(n));
        System.out.println(Makecode2());
    }
    public static String MakeCode1(int n){
            Random in = new Random();

            String code = "";
            for (int i = 0; i < n; i++) {
                int z = in.nextInt(3);
                switch (z) {
                    case 0://大写字母
                        char a = (char) (in.nextInt(26) + 65);
                        code = code + a;
                        break;
                    case 1://小写字母
                        char b = (char) (in.nextInt(26) + 97);
                        code = code +b;
                        break;
                    case 2://数字
                        int c = in.nextInt(10);
                        code = code +c;
                        break;
                }
            }
            return code;
        }


    public static String Makecode2(){
        Random xn = new Random();

        String allcode = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String code = "";

        for (int i =0;i<5;i++) {
            int index = xn.nextInt(allcode.length());//随机生成一个字符串长度内的索引
            char m = allcode.charAt(index);//获取此索引处的字符
            code += m;
        }                          //重复五次
        return code;
    }

}


