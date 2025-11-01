package service;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private ArrayList<User> us1 ;
    public UserService(){
        us1 = new ArrayList<>();
        us1.add(new User("Phong", "123", "phong@gmail.com", "0123456789"));
        us1.add(new User("Lương", "456", "luong@gmail.com", "0987654321"));
    }
    public void  setUs1(ArrayList<User> us1){
        this.us1 = us1;
    }

    public User getUserById(String userId){
        for( int i = 0; i < us1.size(); i++){
            if(userId.equals(us1.get(i).getUsername()))
                return us1.get(i);
        }
        return null;
    }
    public void add(User a){
        us1.add( a);
    }
    public ArrayList<User> getAllUsers(){
        return us1;
    }
}
