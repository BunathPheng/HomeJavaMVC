package model.service;

import mapper.Mapper;
import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao= new UserDaoImpl();
    @Override
    public List<UserDto> getAllUser() {
        return userDao.getAllUsers()
                .stream().map(Mapper::maoFromToUserDto).toList();
    }

    @Override
    public void addUser(User user) {
        userDao.addNewUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

}
