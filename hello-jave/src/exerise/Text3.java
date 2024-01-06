package exerise;

public class Text3 {
    public static void main(String[] args) {
        //找出101-200之间的素数
        for (int i = 101; i <=200 ; i++) {
            pan(i);
        }


    }
    public static void pan(int n){
        boolean flag = true;
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(n + "是素数");
        }
    }
}
