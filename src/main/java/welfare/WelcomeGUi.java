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

public class WelcomeGUi extends JFrame {
    JTextArea historyArea;
    JScrollPane scrollPane;

    public WelcomeGUi() {

        setTitle("Welfare System");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(13, 27, 42));

        JLabel title = new JLabel("WELFARE SYSTEM");
        title.setBounds(247, 80, 400, 40);
        title.setFont(new Font("Arial Black", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        add(title);

        JButton donation = new JButton("DONATION MENU");
        JButton needy = new JButton("NEEDY FORM");
        JButton history = new JButton("HISTORY");
        

        donation.setBounds(300, 180, 200, 50);
        needy.setBounds(300, 260, 200, 50);
        history.setBounds(300, 340, 200, 50);
        
        donation.setFont(new Font("Arial Black", Font.BOLD,16));
        needy.setFont(new Font("Arial Black", Font.BOLD, 16));
        history.setFont(new Font("Arial Black", Font.BOLD,16));

        donation.setBackground(Color.WHITE);
        needy.setBackground(Color.WHITE);
        history.setBackground(Color.WHITE);
     

        donation.setForeground(new Color(25, 25, 112));
        needy.setForeground(new Color(25, 25, 112));
        history.setForeground(new Color(25, 25, 112));
        
        donation.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        needy.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        history.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0, 2)));
        historyArea = new JTextArea();
        historyArea.setEditable(false);
        historyArea.setFont(new Font("Arial", Font.PLAIN, 14));

        scrollPane = new JScrollPane(historyArea);
        scrollPane.setBounds(100, 420, 550, 100);
        scrollPane.setVisible(false);

        add(scrollPane);
        
        
        add(donation);
        add(needy);
        add(history);

        donation.addActionListener(e -> {
            new DonorMenuGUI().setVisible(true);
            this.dispose();
                });
        needy.addActionListener(e -> {
            new NeedyGUI().setVisible(true);
            this.dispose();
                });
           
        
history.addActionListener(e -> {

    String data = GlobalHistory.getHistory();

    if (data == null || data.isEmpty()) {
        historyArea.setText("No history available yet.");
    } else {
        historyArea.setText(
            "===== DONATION HISTORY =====\n\n" + data
        );
    }

    scrollPane.setVisible(true);
});

        setVisible(true);
    }
}
