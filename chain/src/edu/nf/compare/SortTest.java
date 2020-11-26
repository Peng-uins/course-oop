package edu.nf.compare;

import edu.nf.demo2.Filter;
import edu.nf.demo2.FilterB;
import edu.nf.demo2.FilterC;
import edu.nf.demo2.FliterA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 0.0
 */
public class SortTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(6);
        list.forEach(s-> System.out.println(s));
        System.out.println("--------------------------------");
        //Collections默认自然排序从小到大
        Collections.sort(list);
        list.forEach(i-> System.out.println(i));
        System.out.println("--------------------------------");
        List<Filter> filters = new ArrayList<>();
        //Collections.sort(filters);
        filters.add(new FilterB());
        filters.add(new FilterC());
        filters.add(new FliterA());
        filters.forEach(s-> System.out.println(s));

    }
}
