package springmvc.serviceimpl;

import org.springframework.stereotype.Service;
import springmvc.dao.UserMapper;
import springmvc.model.User;
import springmvc.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public ArrayList<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
