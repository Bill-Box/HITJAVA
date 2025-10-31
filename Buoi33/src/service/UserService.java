package service;
import Usere.User;

public class UserService extends User {
    private String userId;
    public static User us = new User();

    public  String getUserById( String userId){
        userId = us.getId();
        return  userId;
    }
    public String getAllUser(){
       return super.toString();
    };

}
