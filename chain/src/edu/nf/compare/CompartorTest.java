package edu.nf.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 0.0
 */
public class CompartorTest {
    public static void main(String[] args) {
        Users u1 = new Users("user1",30);
        Users u2 = new Users("user2",25);
        Users u3 = new Users("user3",28);
        List<Users> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //排序,匿名内部类
        //匿名实现Comparator接口
        /*Collections.sort(list, new Comparator<Users>() {
            @Override
            public int compare(Users o1, Users o2) {
              *//*  if(o1.getAge()>o2.getAge()){
                    return 1;
                }else if(o1.getAge()<o2.getAge()){
                    return -1;
                }else{
                    return 0;
                }*//*
                //用接口内部的方法排序
                return o1.getAge().compareTo(o2.getAge());
            }
        });*/
        //使用lambda表达式是一个函数式编程的写法,不需要定义类型
        //只有一行代码的时候{}和return是可以省略的
        //(o1,o2)->o1.getAge().compareTo(o2.getAge());
        Collections.sort(list,(o1,o2)->{
            return o1.getAge().compareTo(o2.getAge());
        });
        list.forEach(u-> System.out.println(u.getAge()));
    }
}
