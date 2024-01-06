package zscn;

import java.util.Random;

public class fengzhuang {
    public static void main(String[] args) {
        Random xn  =new Random();
        int i = xn.nextInt(10)+11; //(0-9)+11  ->  11-20
        System.out.println(i);
    }
}
