package dao;

import pojo.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 用户数据库
 */
public class UserDao {

    BaseDao baseDao = new BaseDao();

    public List<User> selectAll(){

        List<User> users = new ArrayList<>();
        try{
            ResultSet resultSet = baseDao.query("select * from user");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age=  resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                String account = resultSet.getString("account");
                String password = resultSet.getString("password");
                String headImage = resultSet.getString("head_image");
                users.add(new User(id,name,age,sex,account,password,headImage));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }

}
