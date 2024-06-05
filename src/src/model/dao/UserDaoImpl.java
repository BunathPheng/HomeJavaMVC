package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    List<User> userList = new ArrayList<User>(
            List.of(new User(1,"NiNi","nini12@gmail.com"),
                    new User(2, "NaNa", "NaNa@gmail.com"))
    );
    @Override
    public void addNewUser(User user) {
        userList.add(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userList.removeIf(e->e.getId().equals(id));
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void updateUser(User user) {

    }
}
