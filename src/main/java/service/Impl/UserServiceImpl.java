package service.Impl;

import pojo.User;
import service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }
}
