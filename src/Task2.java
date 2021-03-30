import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

//        Даст ли компилятор собрать данный код? Что будет выведено на экран?

        Map<String, String> myMap = new HashMap<>();
        myMap.put(null, "test 1");
        myMap.put(null, "test 2");
        System.out.println(myMap.get(null));
    }
}
