package welfare;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author abdullah
 */
public class User {
    private String name;
    private String id;
    public User(String namehm, String idhm){
        name = namehm;
        id = idhm;
    }
    public void setName(String nameee){
        name = nameee;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
        

}