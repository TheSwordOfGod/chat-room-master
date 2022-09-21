package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 基础数据访问层
 */
public class BaseDao {

    //声明一个数据库连接器
    Connection connection = null;

    public BaseDao() {

        //在构造函数里写一些初始化类的方法
        if (connection == null) {
            try {
                //1.注册驱动
                Class.forName("com.mysql.cj.jdbc.Driver");

                //2.获取连接
                connection =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_xiguan?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8",
                                "root", "1234");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * 查询类
     *
     * @param sql
     * @return
     */
    public ResultSet query(String sql) {
        return query(sql, null);
    }

    /**
     * 查询类
     *
     * @param sql
     * @return
     */
    public ResultSet query(String sql, List<Object> params) {
        System.out.println("SQL\t" + LocalDateTime.now() + "\t" + sql);
        try {
            //准备好的报表/SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (params != null) {
                int index = 1;
                for (Object param : params) {
                    preparedStatement.setObject(index++, param);
                }
            }
            //执行准备好的报表/SQL
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 增、删、改之类
     *
     * @param sql
     * @return
     */
    public int update(String sql) {
        return update(sql, null);
    }

    /**
     * 增、删、改之类
     *
     * @param sql
     * @param params 参数
     * @return
     */
    public int update(String sql, List<Object> params) {
        System.out.println("SQL\t" + LocalDateTime.now() + "\t" + sql);
        try {
            //准备好的报表/SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (params != null) {
                int index = 1;
                for (Object param : params) {
                    preparedStatement.setObject(index++, param);
                }
            }
            //执行准备好的报表/SQL
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


}
