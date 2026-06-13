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
        title.setBounds(264, 60, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(Color.red);
        add(title);

        JLabel CD1 = new JLabel("Name:");
        CD1.setBounds(200, 180, 100, 25);
        CD1.setForeground(Color.red);
        add(CD1);

        name = new JTextField();
        name.setBounds(320, 180, 200, 25);
        name.setForeground(Color.decode("#1F2937"));
        name.setBackground(Color.WHITE);
        add(name);

        JLabel CD2 = new JLabel("Type:");
        CD2.setBounds(200, 230, 100, 25);
        CD2.setForeground(Color.red);
        add(CD2);

        type = new JTextField();
        type.setBounds(320, 230, 200, 25);
        type.setForeground(Color.decode("#1F2937"));
        type.setBackground(Color.WHITE);
        add(type);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(320, 300, 200, 50);
        submit.setBackground(new Color(0, 191, 99));
        submit.setForeground(new Color(25,25,112));
        submit.setFont(new Font("Arial", Font.BOLD, 16));
        submit.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        add(submit);

        submit.addActionListener(e -> {

            ClothesDonation cd = new ClothesDonation();
            String result = cd.processDonation();

            String suggestion = AlHelper.suggestDonation("Clothes");
            String priority = AlHelper.getPriority("Clothes");

            GlobalHistory.add(result + " | " + name.getText() + " | " + type.getText()
                    + " | AI: " + suggestion + " | Priority: " + priority);

            JOptionPane.showMessageDialog(this, result);
        });

        setVisible(true);
    }
}