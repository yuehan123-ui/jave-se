package shoppingTrolley;

import javax.swing.*;
import java.awt.*;

public class Chuangkou extends JFrame {
    static Goods[] buycar = new Goods[100];;
    static JFrame f;
    JPanel panel;
    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button5;
    JButton button4;
    static Font font = new Font("宋体",Font.BOLD,20);

    public Chuangkou(){
        f = new JFrame();
        panel = new JPanel();
        label = new JLabel("欢迎来到模拟购物车系统");
        button1 = new JButton("添加商品");
        button2 = new JButton("查询商品");
        button3 = new JButton("修改商品");
        button5 = new JButton("结算商品");
        button4 = new JButton("退出程序");
        label.setBounds(90,10,300,100);
        button1.setBounds(100,100,200,50);
        button2.setBounds(100,170,200,50);
        button3.setBounds(100,240,200,50);
        button5.setBounds(100,310,200,50);
        button4.setBounds(100,380,200,50);
        label.setFont(font);
        setBounds(400,200,400,550);
        setTitle("购物车系统");
        setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        panel.add(button5);
        panel.add(button4);
        add(panel);
    }
    public void action(){
        button1.addActionListener(e -> Gongneng.addGoods(buycar));
        button2.addActionListener(e -> Gongneng.inquiryGoods(buycar));
        button3.addActionListener(e -> Gongneng.modifyGoods(buycar));
        button5.addActionListener(e -> Gongneng.payGoods(buycar));
        button4.addActionListener(e -> System.exit(0));
    }



}
