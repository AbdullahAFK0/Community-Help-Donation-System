package welfare;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdullah
 */
import javax.swing.*;
import java.awt.*;

public class ClothesDonationGUI extends JFrame {

    JTextField name, type;

    public ClothesDonationGUI() {

        setTitle("Clothes Donation");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(10, 20, 60));

        JLabel title = new JLabel("CLOTHES DONATION");
        title.setBounds(253, 60, 400, 40);
        title.setFont(new Font("Arial Black", Font.BOLD, 26));
        title.setForeground(Color.WHITE);
        add(title);

        JLabel CD1 = new JLabel("Name:");
        CD1.setBounds(200, 180, 100, 25);
        CD1.setForeground(Color.white);
        add(CD1);

        name = new JTextField();
        name.setBounds(320, 180, 200, 25);
        name.setForeground(Color.decode("#1F2937"));
        name.setBackground(Color.WHITE);
        add(name);

        JLabel CD2 = new JLabel("Type:");
        CD2.setBounds(200, 230, 100, 25);
        CD2.setForeground(Color.white);
        add(CD2);

        type = new JTextField();
        type.setBounds(320, 230, 200, 25);
        type.setForeground(Color.decode("#1F2937"));
        type.setBackground(Color.WHITE);
        add(type);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(320, 300, 200, 50);
        submit.setBackground(Color.WHITE);
        submit.setForeground(new Color(25,25,112));
        submit.setFont(new Font("Arial Black", Font.BOLD, 16));
        submit.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        add(submit);
        
        JButton back = new JButton("BACK");
        back.setBounds(320, 370, 200, 50);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(25,25, 112));
        back.setFont(new Font("Arial Black",Font.BOLD,16));
        back.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        add(back);
        

        submit.addActionListener(e -> {
            try{
                Donor d1 = new Donor(name.getText(), "25FA-111-AI", type.getText());
                 ClothesDonation cd = new ClothesDonation();
            String result = cd.processDonation();

            String suggestion = AlHelper.suggestDonation("Clothes");
            String priority = AlHelper.getPriority("Clothes");

            GlobalHistory.add(result + " | " + d1.getName()+ " | " + d1.getDonationType()
                    + " | AI: " + suggestion + " | Priority: " + priority);

            JOptionPane.showMessageDialog(this, result);
            }
            catch(Exception something){
                JOptionPane.showMessageDialog(this, "Error: Something Went Wrong!");
            }
        });
         back.addActionListener(e -> {
            new DonorMenuGUI().setVisible(true);
            this.dispose();
        });


        setVisible(true);
    }
}