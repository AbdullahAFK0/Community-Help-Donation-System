package welfare;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author abdullah
 */
 class Receiver extends User {
    private String helpNeeded;

    public Receiver(String namehm, String idhm, String helpNeeded) {
        super(namehm, idhm);
        this.helpNeeded = helpNeeded;
    }

    public String getHelpNeeded() {
        return helpNeeded;
    }
}