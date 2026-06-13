package welfare;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdullah
 */
public class Donor extends User {

    private String donationType;

    public Donor(String namehm, String idhm, String donationType) {
        super(namehm, idhm);
        this.donationType = donationType;
    }

    public String getDonationType() {
        return donationType;
    }
}