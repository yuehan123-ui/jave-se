package exerise;

import java.util.Scanner;

public class Text7 {
    public static void main(String[] args) {
        Goods [] buycar = new Goods[100];
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请选择你的需求");
            System.out.println("添加商品到购物车，add");
            System.out.println("查询购物车，inquiry");
            System.out.println("修改商品的购买数量，update");
            System.out.println("结算购物车，pay");
            String command = in.next();
            switch(command){
                case "add":
                    add(buycar,in);
                    break;

                case "inquiry":
                    inquiry(buycar,in);
                    break;
                case "update":
                    update(buycar,in);
                    break;
                case "pay":
                    pay(buycar,in);
            }
        }
    }

    public static void pay(Goods[] buycar,Scanner in) {//支付购物车

        double allmoney = 0;
        for (int i = 0; i < buycar.length; i++) {
            Goods g  = buycar[i];
            if (buycar[i]!=null)
            {
                allmoney = allmoney + g.getPrice();
            }

        }            System.out.println("您一共需要支付"+allmoney+"元");

    }

    public static void update(Goods[] buycar,Scanner in) {//修改购买商品数量
        Goods g ;

        System.out.println("请输入你要修改数量的商品编号");
        int p =in.nextInt();

        System.out.println("请输入修改后的数量");
        int modifynum = in.nextInt();//修改后的的数量
        for (int i = 0; i < buycar.length; i++) {
            g = buycar[i];
            if(g!=null){
                if(g.getId()==p)
                    System.out.println("当前商品的购买数量为："+g.getBuynumber());
                g.setBuynumber(modifynum);
                System.out.println("修改后购买数量为:"+g.getBuynumber());
                break;
            }
        }

    }

    public static void inquiry(Goods[] buycar,Scanner in) {//查询购物车商品
        System.out.println("id"+"\t"+"名字"+ "\t"+"购买数量"+"\t\t"+ "价格");
        for (int i = 0; i < buycar.length; i++) {
               if(buycar[i]!=null){
                   Goods g = buycar[i];
                   System.out.println(g.getId()+"\t"+g.getName()+"\t\t"+g.getBuynumber()+"\t\t\t"+g.getPrice());
               }else{break;}
        }
    }

    public static void add(Goods [] buycar,Scanner in){//添加商品到购物车
        System.out.println("请输入你要添加商品的信息：编号  名字  购买数量  价格");
        Goods g = new Goods();
        g.setId(in.nextInt());
        g.setName(in.next());
        g.setBuynumber(in.nextInt());
        g.setPrice(in.nextDouble());
        for (int i = 0; i < buycar.length; i++) {
            if(buycar[i] == null)
            {   buycar[i] = g;
                break;   }
        }
        System.out.println("添加" + g.getName()+"到购物车成功");
    }
}


  //标准JavaBean : 成员变量全部私有 并配套getset方法 且有无参构造器（默认存在）
class Goods{
    private String name;
    private double price;
    private int id;
    private int buynumber;

    public String getName(){
        return name;}

        public void setName(String name){
            this.name  = name;
        }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getBuynumber() {
        return buynumber;
    }
    public void setBuynumber(int buynumber){
        this.buynumber = buynumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}

