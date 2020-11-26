package edu.nf.homework.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 0.0
 * 获取链接数据库
 */
public class MyUtil {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf-8";
    private static String user = "root";
    private static String password = "root";

    static {
        try{
            //加载驱动
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            throw  new RuntimeException("获取链接异常",e);
        }
    }
}
