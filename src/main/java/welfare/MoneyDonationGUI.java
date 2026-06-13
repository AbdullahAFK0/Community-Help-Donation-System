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

public class MoneyDonationGUI extends JFrame {

    JTextField name, amount;

    public MoneyDonationGUI() {

        setTitle("Money Donation");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(13, 27, 42));

        JLabel title = new JLabel("MONEY DONATION");
        title.setBounds(263, 60, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.red);
        add(title);

        JLabel do1 = new JLabel("Name:");
        do1.setBounds(200, 180, 100, 25);
        do1.setForeground(Color.red);
        add(do1);

        name = new JTextField();
        name.setBounds(320, 180, 200, 25);
        name.setForeground(Color.decode("#1F2937"));
        name.setBackground(Color.WHITE);
        add(name);

        JLabel do2 = new JLabel("Amount:");
        do2.setBounds(200, 230, 100, 25);
        do2.setForeground(Color.red);
        add(do2);

        amount = new JTextField();
        amount.setBounds(320, 230, 200, 25);
        amount.setBackground(Color.WHITE);
        amount.setForeground(Color.decode("#1F2937"));
        add(amount);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(320, 300, 200, 50);
        submit.setBackground(new Color(0, 191, 99));

        submit.setForeground(new Color(25,25,112));
        submit.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        submit.setFont(new Font("Arial", Font.BOLD,16));
        add(submit);

        submit.addActionListener(e -> {

            MoneyDonation md = new MoneyDonation();
            String result = md.processDonation();

            String suggestion = AlHelper.suggestDonation("Medical");
            String priority = AlHelper.getPriority("Medical");

            GlobalHistory.add(result + " | " + name.getText() + " | " + amount.getText()
                    + " | AI: " + suggestion + " | Priority: " + priority);

            JOptionPane.showMessageDialog(this, result);
        });

        setVisible(true);
    }
}