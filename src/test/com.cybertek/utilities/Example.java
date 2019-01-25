package utilities;

public class Example {
    public static void main(String[] args) {


        String one = Singleton.get();
        System.out.println("one: " + one);

        String two = Singleton.get();
        System.out.println("too:" + two);


        String three = Singleton.get();
        System.out.println("three " + three);

    }
}
