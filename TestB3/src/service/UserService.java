package service;
import Usere.User;

import java.util.ArrayList;


public class UserService {
    private ArrayList<User> us1;
    public UserService() {
        us1 = new ArrayList<>();
        us1.add(new User("Phong", "123", "phong@gmail.com", "0123456789"));
        us1.add(new User("Duc", "456", "luong@gmail.com", "0987654321"));
    }
    public void setUs1(ArrayList<User> us1) {
        this.us1 = us1;
    }

    public ArrayList<User> getUs1() {
        return us1;
    }

    public void addUser(User user) {
        us1.add(user);
    }


    // lấy người dùng theo id
    public  User getUserById(String userId){
        for (int i = 0 ; i < us1.size(); i++){
            if(userId.equals(us1.get(i).getId())){
                 return us1.get(i);
            }
        }
        return null;
    }

    // lấy tất cả người dùng
    public ArrayList<User> getAllUsers() {
        return us1;
    }



}
