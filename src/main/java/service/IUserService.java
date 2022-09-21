package service;

import pojo.User;

import java.util.List;

/**
 * 用户service
 */
public interface IUserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 查询用户信息
     * @return
     */
    List<User> list();

    /**
     * 发送用户信息
     * @param user
     * @return
     */
    boolean save(User user);


    /**
     * 删除用户信息
     * @param id
     * @return
     */
    boolean remove(int id);
}
