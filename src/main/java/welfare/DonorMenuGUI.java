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

public class DonorMenuGUI extends JFrame {

    public DonorMenuGUI() {

        setTitle("Donation Menu");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(13, 27, 42));

        JLabel title = new JLabel("DONATION MENU");
        title.setBounds(270, 80, 300, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.RED);
        add(title);

        JButton food = new JButton("FOOD");
        JButton money = new JButton("MONEY");
        JButton clothes = new JButton("CLOTHES");

        food.setBounds(300, 160, 200, 50);
        money.setBounds(300, 230, 200, 50);
        clothes.setBounds(300, 300, 200, 50);

        food.setBackground(new Color(0, 191, 99));
        food.setForeground(new Color(25, 25, 112));
        
        money.setBackground(new Color(0, 191, 99));
        money.setForeground(new Color(25, 25, 112));
        
        clothes.setBackground(new Color(0,191,99));
        clothes.setForeground(new Color(25,25,112));
        
        food.setFont(new Font("Arial", Font.BOLD, 16));
        money.setFont(new Font("Arial", Font.BOLD, 16));
        clothes.setFont(new Font("Arial", Font.BOLD, 16));





        add(food);
        add(money);
        add(clothes);

        food.addActionListener(e -> new FoodDonationGUI());
        money.addActionListener(e -> new MoneyDonationGUI());
        clothes.addActionListener(e -> new ClothesDonationGUI());

        setVisible(true);
    }
}