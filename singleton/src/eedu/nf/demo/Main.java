package eedu.nf.demo;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        People p = People.getInstance();
        People p1 = People.getInstance();
        System.out.println(p);
        System.out.println(p1);

        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
