package edu.nf.homework;

import edu.nf.dome3.ServiceInf;
import edu.nf.dome3.impl.UsersServiceImpl;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) throws Exception{
        CinnectionPool pool = new CinnectionPool(5);
        System.out.println("链接池大小："+pool.Size());//5
        //获取链接
        Connection conn = pool.getConnection();
        Connection conn1 = pool.getConnection();
        Connection conn2 = pool.getConnection();
        System.out.println("链接池大小："+pool.Size());//4
        //注意：当comm的close方法时，将链接放回链接池
        conn.close();
        System.out.println("链接池大小："+pool.Size());//5
    }
}
