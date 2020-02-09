package oOp.human;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Ivan");
        human1.setSurename("Ivanovs");
        human1.setAge(25);
        human1.hello(human1);

        Human human2 = new Human("John", "Smith", 35);
        human2.hello(human2);
    }
}
