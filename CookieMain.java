
package Cookie;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CookieMain {
    
    JLabel counterLabel,perSecLabel;
    int cookieCounter;
    Font font1,font2;
    CookieHandler handler = new CookieHandler();
    public static void main(String[] args) {
        
        new CookieMain();
    }
    
    public CookieMain(){
        cookieCounter = 0;
        createFont();
        createUI();
    }
    
    public void createFont(){
        font1 = new Font("Comic Sans MS",Font.BOLD,32);
        font2 = new Font("Comic Sans MS",Font.BOLD,15);
    }
    
    public  void createUI(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
      
        window.setLayout(null);
       // window.setLocationRelativeTo(null);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);

       // window.setVisible(true);
        
        JPanel cookiePanel = new JPanel();
        cookiePanel.setBounds(100, 220, 200, 200);
        cookiePanel.setBackground(Color.black);
        window.add(cookiePanel);
        
        ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource("icon/cookie.jpg"));
        
        JButton cookieButton = new JButton();
        cookieButton.setBackground(Color.black);
        cookieButton.setFocusPainted(false);
        cookieButton.setBorder(null);
        cookieButton.setIcon(cookie);
        cookieButton.addActionListener(handler);
        cookiePanel.add(cookieButton);
        
        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(100, 100, 200, 100);
        counterPanel.setBackground(Color.black);
        counterPanel.setLayout(new GridLayout(2,1));
        window.add(counterPanel);
      
        counterLabel = new JLabel(cookieCounter +" Cookies");
        counterLabel.setBackground(Color.YELLOW);
        counterLabel.setFont(font1);
        counterLabel.setForeground(Color.white);
        counterPanel.add(counterLabel);
        
         perSecLabel = new JLabel();
        perSecLabel.setForeground(Color.white);
        perSecLabel.setFont(font2);
        counterPanel.add(perSecLabel);

         window.setVisible(true);

    }
    
    public class CookieHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cookieCounter++;
            counterLabel.setText(cookieCounter +" Cookies");
        }
    }
}
