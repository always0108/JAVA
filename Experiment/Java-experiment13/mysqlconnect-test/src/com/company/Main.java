package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        //注册Driver操作对象
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("找不到指定的类");
        }

        //取得Connection操作对象
        String url = "jdbc:mysql://localhost:3306/login?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String user = "root";
        String password = "LM19980108!@";
        Connection conn = null;
        SQLException ex = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            if(!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");



            /*Statement stmt = conn.createStatement();

            //看是否能查到相应的数据
            ResultSet result = stmt.executeQuery("SELECT * FROM Password WHERE name = 'limeng'");

            //通过查看是否存在查找到数据来判断
            if(result.next()){
                System.out.println("查到该信息");
            }else{
                System.out.println("查不到该信息");
            }*/

            /*
            //executeQuery返回的是java.sql.ResultSet对象,代表查询结果，
            //查询结果是一笔一笔的数据，可以用ResultSet的next()返回下一笔数据
            ResultSet result = stmt.executeQuery("SELECT * FROM Password ");
            System.out.printf("  %6s          %10s\n","name","password");
            while(result.next()){
                //可以用getString(),getInt等方法取得数据
                System.out.printf("  %-20s%-20s\n",result.getString("name"),result.getString("password"));
            }*/

            //Statement或者ResultSet不使用时，可以用close()关闭，以释放相关资源
            //Statement关闭时，所关联的ResultSet也会自动关闭

            //添加
            //String tempname = "user";
            //String temppassword = "123789";
            //stmt.execute(String.format("INSERT INTO Password(name,password) VALUES ('%s','%s')",tempname,temppassword));

            //更新
            //stmt.execute("UPDATE Password SET password = '111111' WHERE name = 'limeng'");

            //删除(整行，不是某一列)
            //stmt.execute("DELETE FROM Password WHERE name = 'user'");

            //result.close();
            //stmt.close();

            PreparedStatement stmt ;

            //增加
            //添加前最好判断数据库中是否有该数据存在
            /*stmt= conn.prepareStatement(
                    "INSERT INTO Password(name,password) VALUES (?,?)");
            stmt.setString(1,"test");
            stmt.setString(2,"222222");
            stmt.executeUpdate();
            stmt.clearParameters();//清除设置参数
            */

            //删除
            //stmt = conn.prepareStatement("DELETE FROM Password WHERE name = 'test'");
            //stmt.executeUpdate();

            //修改
            /*stmt = conn.prepareStatement("UPDATE Password SET  password = ? WHERE name = ?");
            stmt.setString(1,"19980108");
            stmt.setString(2,"li");
            stmt.executeUpdate();*/

            //删除和更新该条数据不存在时，不做任何操作

            //查找
            stmt = conn.prepareStatement("SELECT * FROM  Password");
            ResultSet result = stmt.executeQuery();
            while (result.next()){
                System.out.printf("%3d %-20s%-20s\n",result.getInt("id"),result.getString("name"),result.getString("password"));

            }
            stmt.close();

            //关闭与数据库的连接
            conn.close();
        }catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
    }
}