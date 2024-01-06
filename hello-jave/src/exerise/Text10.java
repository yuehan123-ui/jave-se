package exerise;

import java.util.ArrayList;

/*
      1.定义类用于创建电影对象及封装数据
      2.定义集合存储电影对象
      3.遍历集合，输出数据// 集合存储的是数据的地址，如果要得到集合中所存储的数据，需要遍历集合，用get方法得到数据

* */

public class Text10 {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie("《肖申克的救赎》",9.7,"罗宾斯");
        //movies.add(new Movie("《肖申克的救赎》",9.7,"罗宾斯"))

        Movie m2 = new Movie("《霸王别姬》",9.6,"张国荣");
        Movie m3 = new Movie("《阿甘正传》",9.5,"汤姆.汉克斯");
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie movie =movies.get(i);
            System.out.println("电影名称："+movie.getName());
            System.out.println("评分："+movie.getScore());
            System.out.println("主演："+movie.getActor());
        }
    }

}


class Movie{
    private String name;
    private double score;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

}
