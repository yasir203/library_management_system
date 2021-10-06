package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class about extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new about().setVisible(true);			
	}
    
        public about() {
            
            super("LIBRARY MANAGEMENT SYSTEM");
            setIconImage(Toolkit.getDefaultToolkit().getImage("E://library/v5/libraryManagementSystem/src/library/management/system/icons/logo.png"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon("E://library/v5/libraryManagementSystem/src/library/management/system/icons/logo.png");
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

           


            JLabel l6 = new JLabel("Developed By : Yasir(203)");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

         

                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

