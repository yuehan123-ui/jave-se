package system.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AccountSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random xn = new Random();
        ArrayList list = new ArrayList();
        while (true) {
            System.out.println("---------欢迎您进入ATM系统---------");
            System.out.println("1.登录账户");
            System.out.println("2.注册账户");
            int num1 = in.nextInt();
            switch (num1) {
                // -------------------------登录账户
                case 1:
                    System.out.println("请输入您的卡号：");
                    String cardnumber = in.next();
                    for (int i = 0; i < list.size(); i++) {
                        Account p = (Account) list.get(i);
                        String okcardnumber = p.getCardnumber();
                        if (cardnumber.equals(okcardnumber)) {
                            //输入的卡号正确
                            System.out.println("请输入您的密码");


                                String password = in.next();
                                String okpassword = p.getAccountpassward();
                                if (password.equals(okpassword)) {
                                    System.out.println("登录成功！");
                                    while(true){
                                    success(in, p,list);}
                                } else {
                                    System.out.println("您输入的密码有误,请重新输入");
                                }
                                break;



                        }
                        System.out.println("您输入的卡号不存在");
                    }

                    break;

                //--------------------------注册账户
                case 2:
                    Account account = new Account();
                    System.out.println("请输入您的用户名");
                    account.setName(in.next());
                    System.out.println("请输入您的密码");
                    account.setAccountpassward(in.next());
                    System.out.println("请输入您的开户余额");
                    account.setBalance(in.nextDouble());

                    //------------------------输入信息后，随机分配给用户一个卡号

                    String allcode = "1234567890";
                    String code = "";
                    for (int i = 0; i < 7; i++) {
                        char x = allcode.charAt(xn.nextInt(11));
                        code +=x;
                    }

                    account.setCardnumber(code);

                            list.add(account);


                    System.out.println(account.getName()+"注册成功，您的卡号为" + code);
                    break;

                default:
                    System.out.println("输入有误，请重新输入！");

            }
        }
    }



    //-------------------------------------登陆成功之后

    public static void success(Scanner in,Account p,ArrayList list){
        System.out.println("1.查询");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        int menu = in.nextInt();
        switch(menu){
            case 1://    查询
                inquiry(p);
                break;
            case 2://    存款
                addmoney(p, in);
                break;
            case 3://    取款
                reducemoney(p, in);
                break;
            case 4://    转账
                sendmoney();
                break;
            case 5://    修改(modify)密码
                modifypassword(p,in);
                break;
            case 6://    退出
                System.exit(0);
                break;
            case 7://    注销账户
                deleteaccount(p,list);
                break;
            default:
                System.out.println("输入有误");
        }
    }

    private static void deleteaccount(Account p,ArrayList list) {
        boolean y =list.remove(p);
        if(y==true){
        System.out.println("删除账户"+p.getName()+"成功");}
        else
        {
            System.out.println("注销失败");
        }

    }
/*
          存在的问题： 将集合中账户的密码修改
*/
    private static void modifypassword(Account p,Scanner in) {
        System.out.println("请输入您当前密码:");
        if (in.next().equals(p.getAccountpassward())){
            System.out.println("请输入修改后的密码：");
            String accountpasswords = in.next();
            p.setAccountpassward(accountpasswords);
            System.out.println("修改密码成功");
        }else
        {
            System.out.println("密码输入错误");
        }
    }

    private static void sendmoney() {


    }
/*
        存在的问题： 将账户余额修改为取款后的余额
        （修改集合中元素）
*/
    private static void reducemoney(Account p,Scanner in) {
        System.out.println("账户当前余额为"+p.getBalance());
        System.out.println("请输入取款数目：");
        double money = in.nextDouble();
        double balances = p.getBalance() - money;
        p.setBalance(balances);//账户这个对象存在集合容器里，想要更改余额，只需用set方法更改类中成员变量的值
        System.out.println("取款成功，当前账户余额为"+ p.getBalance());
    }

    private static void addmoney(Account p,Scanner in) {
        System.out.println("当前余额为："+ p.getBalance());
        System.out.println("请输入存款数目：");
        double m = in.nextDouble();
        p.setBalance(p.getBalance()+m);
        System.out.println("存款成功，当前账户余额为"+p.getBalance());
    }

    private static void inquiry(Account p) {
        System.out.println("用户名："+p.getName());
        System.out.println("余额："+p.getBalance());
    }
}
