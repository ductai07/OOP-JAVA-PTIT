import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Xinchao{
    public static void main(String[] args) {
        JFrame frame = new JFrame("May Tinh Bỏ Túi ");
        JLabel lb1 = new JLabel("Nhập số thứ nhất: "); //neu muon tinh căn bậc2 thi nhap mot so ,con lai NHAP 2 SO 
        JLabel lb2 = new JLabel("Nhập số thứ 2: ");
        JLabel lb3 = new JLabel("Kết quả: ");
        
        lb1.setBounds(30,30,150,30);
        lb2.setBounds(30,70,150,30);
        lb3.setBounds(30,110,150,30);
        
        JTextField jtf1 = new JTextField("");
        JTextField jtf2 = new JTextField("");
        JTextField jtf3 = new JTextField("");
        
        jtf1.setBounds(150,30,150,30);
        jtf2.setBounds(150,70,150,30);
        jtf3.setBounds(150,110,150,30);
         
        JButton xoa = new JButton("XOA");
        JButton cong = new JButton("A+B");
        JButton tru = new JButton("A-B");
        JButton nhan = new JButton("A*B");
        JButton chia = new JButton("A/B");
        JButton luythua = new JButton("A^B");
        JButton can = new JButton("CAN");
        
        xoa.setBounds(30, 160, 60, 30);
        luythua.setBounds(110, 160, 60, 30);
        can.setBounds(190, 160, 60, 30);
        cong.setBounds(30, 200, 60, 30);
        tru.setBounds(110, 200, 60, 30);
        nhan.setBounds(190, 200, 60, 30);
        chia.setBounds(270, 200, 60, 30);
        
        xoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf1.setText(" ");
                jtf2.setText(" ");
                jtf3.setText(" ");
            }
        });
        
        
        
        cong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                jtf3.setText((num1 + num2) + "");
            }
        });

       
        tru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                jtf3.setText((num1 - num2) + "");
            }
        });

  
        nhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                jtf3.setText((num1 * num2) + "");
            }
        });

      
        chia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                if (num2 != 0) {
                    jtf3.setText((num1 / num2) + "");
                } else {
                    jtf3.setText("Không thể chia cho 0");
                }
            }
        });

         
        luythua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                jtf3.setText(Math.pow(num1, num2) + "");
            }
        });

         //neu muon tinh can thi nhap mot so ,con lai cac button deu nhap 2 so  
        can.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                jtf3.setText(Math.sqrt(num1) + "");
            }
        });

        
        
        frame.add(lb1);frame.add(lb2);frame.add(lb3);
        frame.add(jtf1);frame.add(jtf2);frame.add(jtf3);
        frame.add(cong);frame.add(tru);frame.add(xoa);frame.add(nhan);frame.add(chia);frame.add(luythua);frame.add(can);
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
                
        
        
    }
}