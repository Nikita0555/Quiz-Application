
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
        Score(String name,int score){
         setBounds(400,150,750,550);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/quiz1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,200,300,250);
        add(img);
        
        JLabel heading = new JLabel("Thankyou " + name + " For playing Master Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score is " + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
         add(submit);
         
        setVisible(true);
    }
         
         public void actionPerformed(ActionEvent ae){
      setVisible(false);
      new Login();
}
    public static void main(String[] args){
        new Score("User",0);
    }
    
}
