import utils.DBUtil;

import java.sql.*;

public class JDBCTest {

    private static void test1()  {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        // 1、加载驱动
        // Class.forName("com.mysql.jdbc.Driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2、获取mysql连接 结构 jdbc:mysql://ip:port/database_name;
            String url = "jdbc:mysql://localhost:3306/student_manager?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
            // mysql 用户名
            String username = "root";
            // mysql 密码
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            // 3、执行SQL语句
            String sql = "select * from student";
            // 返回预处理对象
            statement = connection.prepareCall(sql);

            // int i = statement.executeUpdate(); // 只是执行SQL语句是：update、delete、insert
            resultSet = statement.executeQuery(); // 只能执行SQL语句：select

            // 4、 处理执行结果
            while (resultSet.next())
            {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println("id: " + id + " name: " + name);
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            if (resultSet != null)
            {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (statement != null)
            {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null)
            {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }

    private static void test2() throws SQLException {
        Connection connection = DBUtil.getConnection();
        PreparedStatement statement = connection.prepareCall("select * from student");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next())
        {
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");

            System.out.println("id: " + id + " name: " + name);
        }
        DBUtil.close(resultSet, statement, connection);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        test1();
        test2();
    }

}