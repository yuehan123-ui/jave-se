package exerise;
/*

             根据学号搜索集合中学生的信息
* */

import java.util.ArrayList;
import java.util.Scanner;

public class Text11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.定义一个学生类

        //2.定义一个集合存储学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("200206050301","钢铁侠","会计1班"));
        students.add(new Student("200206050302","蜘蛛侠","软件2班"));
        students.add(new Student("200206050303","奇异博士","土木1班"));
        students.add(new Student("200206050303","猩红女巫","舞蹈4班"));

        //3.遍历集合，输出学生数据
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学号："+s.getId()+"\t"+"姓名："+s.getName()+"\t"+"班级"+"\t"+s.getClassname());
        }
        while (true) {
            System.out.println("请输入您所要查找学生的学号：");
            String id = in.next();
            Student s =byidgetstudent(students,id);
            if(s==null){
                System.out.println("查无此人");
            }else
            {
                System.out.println("学号："+s.getId()+"\t"+"姓名："+s.getName()+"\t"+"班级"+"\t"+s.getClassname());
            }
        }
    }

    //4.定义一个方法，通过学号在集合中搜索学生信息
    public static Student byidgetstudent(ArrayList<Student> students,String id){

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (id.equals(s.getId())){
                return s;
            }
        }
        return null;

    }
}
class Student{
    private String id;
    private String name;
    private String classname;

    public Student() {
    }

    public Student(String id, String name, String classname) {
        this.id = id;
        this.name = name;
        this.classname = classname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
