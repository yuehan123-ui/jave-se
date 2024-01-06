package fangfa;

public class Method3 {
    public static void main(String[] args) {
        int b = 10;
        check(b);
        System.out.println(b);
    }

    public static void check(int b) {
        System.out.println(b);
        b = 20;
        System.out.println(b);
    }
}

