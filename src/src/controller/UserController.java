package controller;

import model.User;
import model.dto.UserDto;
import model.service.UserServiceImpl;
import model.service.UserService;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUser() {
        return userService.getAllUser();
    }
    public  void addNewUser(User uer) {userService.addUser(uer);}
    public void deleteUser(Integer id) {
        userService.deleteUser(id);
    }
}
