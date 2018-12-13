package springmvc.service;

import springmvc.model.User;

import java.util.ArrayList;

public interface UserService {

     int insertUser(User user);

     ArrayList<User> getAllUser();

     User selectByPrimaryKey(Integer id);

}
