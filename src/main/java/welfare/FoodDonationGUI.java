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

public class FoodDonationGUI extends JFrame {

    JTextField name, qty;

    public FoodDonationGUI() {

        setTitle("Food Donation");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(13, 27, 42));

        JLabel title = new JLabel("FOOD DONATION");
        title.setBounds(263, 60, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.RED);
        add(title);

        JLabel fD1 = new JLabel("Name:");
        fD1.setBounds(200, 180, 100, 25);
        fD1.setForeground(Color.red);
        add(fD1);

        name = new JTextField();
        name.setBounds(320, 180, 200, 25);
        name.setForeground(Color.decode("#1F2937"));
        name.setBackground(Color.WHITE);
        add(name);

        JLabel fD2 = new JLabel("Quantity:");
        fD2.setBounds(200, 230, 100, 25);
        fD2.setForeground(Color.red);
        add(fD2);

        qty = new JTextField();
        qty.setBounds(320, 230, 200, 25);
        qty.setForeground(Color.decode("#1f2937"));
        qty.setBackground(Color.WHITE);
        add(qty);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(320, 300, 200, 50);
        submit.setBackground(new Color(0, 191, 99));

        submit.setForeground(new Color(25,25,112));
        submit.setFont(new Font("Arial", Font.BOLD, 16));
        submit.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        add(submit);

        submit.addActionListener(e -> {

            FoodDonation fd = new FoodDonation();
            String result = fd.processDonation();

            String suggestion = AlHelper.suggestDonation("Food");
            String priority = AlHelper.getPriority("Food");

            GlobalHistory.add(
                    result +
                    " | Name: " + name.getText() +
                    " | Qty: " + qty.getText() +
                    " | AI Suggestion: " + suggestion +
                    " | Priority: " + priority
            );

            JOptionPane.showMessageDialog(this, result);
        });

        setVisible(true);
    }
}