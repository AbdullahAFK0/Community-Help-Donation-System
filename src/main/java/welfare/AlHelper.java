/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package welfare;

/**
 *
 * @author abdullah
 */
public class AlHelper {

    public static String suggestDonation(String need) {

        if (need.equalsIgnoreCase("Food"))
            return "Rice, Flour, Sugar";

        if (need.equalsIgnoreCase("Medical"))
            return "Medicines";

        if (need.equalsIgnoreCase("Education"))
            return "Books and Stationery";

        if (need.equalsIgnoreCase("Clothes"))
            return "Blankets and Clothes";

        return "choose only from food,medical, education and clothes....";
    }

    public static String getPriority(String need) {

        if (need.equalsIgnoreCase("Medical"))
            return "URGENT!!!";

        if (need.equalsIgnoreCase("Food"))
            return "HIGH!!";

        if (need.equalsIgnoreCase("Education"))
            return "MEDIUM!";

        return "LOW";
    }
}