package exerise;

public class Text5 {
    public static void main(String[] args) {
        //数组的复制
        int  [] arr={1,2,3};
        int [] arrs=new int [arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            arrs[i] = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        for (int j = 0; j < arrs.length; j++) {
            System.out.println(arrs[j]);
        }
    }
}
