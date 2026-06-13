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

public class NeedyGUI extends JFrame {

    JTextField name, need;

    public NeedyGUI() {

        setTitle("Needy Form");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(13, 27, 42));

        JLabel title = new JLabel("NEEDY FORM");
        title.setBounds(260, 60, 300, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.RED);
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

        JLabel do2 = new JLabel("Need:");
        do2.setBounds(200, 230, 100, 25);
        do2.setForeground(Color.red);
        add(do2);

        need = new JTextField();
        need.setBounds(320, 230, 200, 25);
        need.setForeground(Color.decode("#1F2937"));
        need.setBackground(Color.WHITE);
        add(need);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(320, 300, 200, 50);
        submit.setBackground(new Color(0, 191, 99));

        submit.setForeground(new Color(25,25,112));
        submit.setFont(new Font("Arial", Font.BOLD, 16));
        
        submit.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));

        add(submit);

        submit.addActionListener(e -> {
            try {
                Receiver r = new Receiver(name.getText(), "001", need.getText());

            String suggestion = AlHelper.suggestDonation(need.getText());
            String priority = AlHelper.getPriority(need.getText());

            GlobalHistory.add(
                    "NEEDY | " + r.getName() +
                    " | Need: " + r.getHelpNeeded() +
                    " | Suggestion: " + suggestion +
                    " | Priority: " + priority
            );
            JOptionPane.showMessageDialog(this, "Saved Successfully");
            }catch (Exception um) {
                JOptionPane.showMessageDialog(this, "Error: " + um.getMessage());
            }
     
        });

        setVisible(true);
    }
}