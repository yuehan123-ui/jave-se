package shoppingTrolley;


import javax.swing.*;
import java.awt.*;

public class Gongneng extends Chuangkou{

    static double allmoney = 0; // 总金额
    public static void addGoods(Goods[] buycar) {

        Goods goods = new Goods();
        JDialog dialog = new JDialog(f,"添加商品");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入你要添加商品的信息");
        JLabel label2 = new JLabel("商品编号");
        JLabel label3 = new JLabel("商品名称");
        JLabel label4 = new JLabel("商品价格");
        JLabel label5 = new JLabel("购买数量");

        JTextArea textArea = new JTextArea(4,20);
        JButton button1 = new JButton("确定");
        JButton button2 = new JButton("退出");
        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JTextField textField3 = new JTextField(15);
        JTextField textField4 = new JTextField(15);
        dialog.setVisible(true);
        textArea.setEditable(false);
        label.setFont(font);
        textArea.setFont(font);
        panel.setBackground(Color.pink);
        textArea.setBackground(Color.pink);


        textField1.setFont(font);
        textField2.setFont(font);
        textField3.setFont(font);
        textField4.setFont(font);
        button1.setFont(font);
        button2.setFont(font);

        dialog.setBounds(450,250,280,400);
        panel.add(label);
        panel.add(label2);
        panel.add(textField1);
        panel.add(label3);
        panel.add(textField2);
        panel.add(label4);
        panel.add(textField3);
        panel.add(label5);
        panel.add(textField4);

        panel.add(button1);


        panel.add(button2);

        panel.add(textArea);
        dialog.add(panel);


        button1.addActionListener(e -> {

            goods.setId(Integer.parseInt(textField1.getText()));
            goods.setName(textField2.getText());
            goods.setBuynumber(Integer.parseInt(textField4.getText()));
            goods.setPrice(Double.parseDouble(textField3.getText()));
            for (int i = 0; i < buycar.length; i++) {
                if(buycar[i] == null)
                {   buycar[i] = goods;
                    break;   }
            }

            textArea.append("\t"+"添加成功");

        });
        button2.addActionListener(e -> {

            dialog.setVisible(false);
        });

    }

    public static void inquiryGoods(Goods[] buycar) {
        JDialog dialog = new JDialog(f,"查询商品");
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(20,27);
        textArea.setBackground(Color.ORANGE);
        textArea.setEditable(false);
        textArea.append("商品编号"+"\t"+"商品名称"+"\t"+"购买数量"+"\t"+"商品价格"+"\n");
        dialog.setBounds(450,250,330,400);
        dialog.setVisible(true);
        panel.add(textArea);
        dialog.add(panel);

        for (int i = 0; i < buycar.length; i++) {
            if(buycar[i]!=null){
                Goods g = buycar[i];
                textArea.append(g.getId()+"\t"+g.getName()+"\t"+g.getBuynumber()+"\t"+g.getPrice()+"\n");

            }else{ break;}
        }

    }

    public static void modifyGoods(Goods[] buycar) {
        JDialog dialog = new JDialog(f,"修改商品购买数量");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("请输入需要修改的商品编号");
        JLabel label2 = new JLabel("商品编号");
        JLabel label3 = new JLabel("请输入修改后的购买数量");
        JLabel label4 = new JLabel("购买数量");
        JLabel label5 = new JLabel("");
        JLabel label6 = new JLabel("");
        JTextField textField1 =new JTextField(15);
        JTextField textField2 =new JTextField(15);
        JButton button1 = new JButton("确定");
        JButton button2 = new JButton("返回");
        dialog.setBounds(450,250,300,400);
        dialog.setVisible(true);
        panel.setBackground(Color.pink);
        panel.add(label);
        panel.add(label2);
        panel.add(textField1);
        panel.add(label3);
        panel.add(label4);
        panel.add(textField2);
        panel.add(button1);
        panel.add(button2);
        panel.add(label5);
        panel.add(label6);
        dialog.add(panel);

        label.setFont(font);
        label5.setFont(font);
        label3.setFont(font);
        label6.setFont(font);
        textField1.setFont(font);
        textField2.setFont(font);
        button1.setFont(font);
        button2.setFont(font);


    button1.addActionListener(e -> {
        Goods g ;
        int p =Integer.parseInt(textField1.getText());

        int modifynum = Integer.parseInt(textField2.getText());//修改后的的数量
        for (int i = 0; i < buycar.length; i++) {
            g = buycar[i];
            if(g!=null){
                if(g.getId()==p)
                    label5.setText("当前商品的购买数量为"+g.getBuynumber());

                g.setBuynumber(modifynum);
                label6.setText("修改后购买数量为"+g.getBuynumber());
                break;
            }
        }
    });
    button2.addActionListener(e -> {
        dialog.setVisible(false);
    });
    }


    public static void payGoods(Goods[] buycar) {

        JDialog dialog = new JDialog(f,"结算商品");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        JTextArea textArea = new JTextArea();
        JScrollPane jsp = new JScrollPane(textArea);//为文本区域添加滚动条


        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        textArea.setBackground(Color.ORANGE);
        textArea.setEditable(false);
        textArea.append("商品编号"+"\t"+"商品名称"+"\t"+"购买数量"+"\t"+"商品单价"+"\t"+"商品总价"+"\n");
        dialog.setBounds(450,250,430,400);
        dialog.setVisible(true);
        panel.add(textArea);
        panel.add(jsp);
        panel.add(label);
        panel.setBackground(Color.pink);
        dialog.add(panel);


        for (int i = 0; i < buycar.length; i++) {
            if(buycar[i]!=null){
                Goods g = buycar[i];
                textArea.append(g.getId()+"\t"+g.getName()+"\t"+g.getBuynumber()+"\t"+g.getPrice()+"\t"+g.getBuynumber()*g.getPrice()+"\n");
                allmoney = allmoney + g.getPrice()*g.getBuynumber();
            }else{ break;}

        }
        textArea.append("\n");
        textArea.append("总金额"+"\t\t\t\t"+allmoney);
        label.setText("您一共需要支付"+allmoney+"元");
    }
}
