package shoppingTrolley;

 public class Goods{
    private String name; //商品名称
    private double price;//商品价格
    private int id;//商品编号
    private int buynumber;//商品购买数量

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