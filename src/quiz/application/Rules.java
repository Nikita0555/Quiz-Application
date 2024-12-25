
 
package quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name=name;
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
       JLabel heading = new JLabel("Welcome " + name + " to Master Minds");
        heading.setBounds(150,40,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
        "<html>"+
                "1.  The quizzes consists of questions carefully designed to help you self-assess your comprehension of the information presented on the topics covered in the module." + "<br><br>" +                         
                "2.  No data will be collected on the website regarding your responses or how many times you take the quiz. "+"<br><br>"+
                "3.  After responding to a question, click on the Next Button at the bottom to go to the next question. "+"<br><br>"+
                "4.  You will have 15 min for Each question. "+"<br><br>"+
                "5.  If you take more than 15 minutes for a question, It will take you to the next question.   "+"<br><br>"+
                "6.  Read the question carefully before answering.    "+"<br><br>"+
                
                "<html>"
        );
        rules.setForeground(Color.BLACK);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
     setSize(800,650);
     setLocation(350,100);
     setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
public static void main(String[] args){
    
    new Rules("User");
}
}
        


