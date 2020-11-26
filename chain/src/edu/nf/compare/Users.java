package edu.nf.compare;

/**
 * @author 0.0
 */
public class Users {

    private String name;
    private Integer age;

    public Users() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Users(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
