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
        title.setBounds(253, 70, 400, 40);
        title.setFont(new Font("Arial Black", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        add(title);

        JButton food = new JButton("FOOD");
        JButton money = new JButton("MONEY");
        JButton clothes = new JButton("CLOTHES");
        JButton back = new JButton("BACK");
        

        food.setBounds(300, 160, 200, 50);
        money.setBounds(300, 240, 200, 50);
        clothes.setBounds(300, 320, 200, 50);
        back.setBounds(300, 400, 200, 50);

        food.setBackground(Color.WHITE);
        food.setForeground(new Color(25, 25, 112));
        
        money.setBackground(Color.WHITE);
        money.setForeground(new Color(25, 25, 112));
        
        clothes.setBackground(Color.WHITE);
        clothes.setForeground(new Color(25,25,112));
        
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(25,25, 112));
        
        food.setFont(new Font("Arial Black", Font.BOLD, 16));
        money.setFont(new Font("Arial Black", Font.BOLD, 16));
        clothes.setFont(new Font("Arial Black", Font.BOLD, 16));
        back.setFont(new Font("Arial Black",Font.BOLD,16));


        add(food);
        add(money);
        add(clothes);
        add(back);
        

        food.addActionListener(e -> { 
            new FoodDonationGUI().setVisible(true);
            this.dispose();
                });
        money.addActionListener(e -> {
            new MoneyDonationGUI().setVisible(true);
            this.dispose();
                });
        clothes.addActionListener(e -> {
            new ClothesDonationGUI().setVisible(true);
            this.dispose();
                });
        back.addActionListener(e -> {
            new WelcomeGUi().setVisible(true);
            this.dispose();
        });
                
        setVisible(true);
    }
}