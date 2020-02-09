package oOp.human;

public class Human {
    private String name;
    private String surename;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(){}
    public Human(String name, String surename, int age){
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    //Переопределите метод toString() в классе Human таким образом,
    public String toString() {
        return "Hello! My name is " + this.name + " " + this.surename + ", I'm " + this.age + " years old.";
    }
    public void hello(Human human){
        System.out.println(human);
    }

}