package fangfa;

public class Method5 {
    public static void main(String[] args) {
        //定义一个方法  比较两个数组是否相等 （长度 大小 顺序 都相等）
        int[]arr1={1,2,3,4};
        int[]arr2={1,2,3,5};

        System.out.println( compare(arr1,arr2));
    }
    public static boolean compare(int [] arr1,int [] arr2){
        if(arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }return true;
        }else{
            return false;

        }
    }
}
