package edu.nf.homework;

import edu.nf.homework.util.MyUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

public class CinnectionPool {

    /**
     *链接池
     */
    private static LinkedList<Connection> pool = new LinkedList();

    /**
     * 在构造方法里面初始化连接池的大小（从数据库获取5个Connection放到pool中）
     */
    public CinnectionPool(int size) {
        for(int i = 0;i<size;i++){
            //获取链接对象（目标对象）
            Connection conn = MyUtil.getConnection();
            //根据目标对象创建代理实例,将对象放入连接池
            pool.add(createProxy(conn));
        }
    }


    /**
     * 根据目标对象创建代理实例
     * @param conn 目标对象
     * @return
     */
    private Connection createProxy(Connection conn){
        return (Connection) Proxy.newProxyInstance(CinnectionPool.class.getClassLoader(),new Class[]{Connection.class},new IinkInvocationHandler(pool,conn));
    }

    /**
     * 获取链接的方法，是从链接池获取
     * @return
     */
    public Connection getConnection(){
        //防止连接池为空报错
        if(pool.size()>0){
            //从连接池移除对象并返回
            return pool.removeFirst();
        }else{
            throw new RuntimeException("链接池暂无可用链接");
        }
    }

    /**
     * 用完把数据还回来
     * @param conn
     */
    public static void backToPool(Connection conn){
        pool.addLast(conn);
    }

    /**
     * 链接池大小
     * @return
     */
    public int Size(){
        return pool.size();
    }
}
