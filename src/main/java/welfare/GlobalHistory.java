package welfare;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdullah
 */
public class GlobalHistory {
    public static StringBuilder history = new StringBuilder();
    public static void add(String data){
        history.append(data).append("\n");
    }
    public static String getHistory(){
        return history.toString();
    }
}
         
    

