package zscn;

public class Text {
    public static void main(String[] args) {
        Student s = new Student("张三",2005);
        s.show();
    }
}
class Student{
    String name;
    int stunum;
    public Student(String name,int stunum){
        this.name = name;
        this.stunum = stunum;
    }
    public void show(){
        System.out.println("姓名:"+name+"\t"+"学号:"+stunum);
    }
}
