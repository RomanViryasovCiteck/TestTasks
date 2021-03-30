public class Task3 {

    public static void main(String[] args) {

//        Что будет выведено на экран?

        Cat myCat = new Cat();

        System.out.println(myCat.name);

    }

}

class Animal {
    public String name;

    public Animal() {
        name = "Tom";
    }
}

class Cat extends Animal {

}