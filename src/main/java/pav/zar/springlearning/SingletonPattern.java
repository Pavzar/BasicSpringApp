package pav.zar.springlearning;

public class SingletonPattern {
    private static SingletonPattern instance;
    private String value;

    public String getValue() {
        return value;
    }

    private SingletonPattern(String value) {
        this.value = value;
    }


    public static SingletonPattern getInstance(String value) {
        if (instance == null) {
            instance = new SingletonPattern(value);
        }
        return instance;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        SingletonPattern first = SingletonPattern.getInstance("value1");
        SingletonPattern second = SingletonPattern.getInstance("value2");

        //true
        System.out.println(first == second);
        //value1
        System.out.println(first.getValue());
        //value1
        System.out.println(second.getValue());

    }
}
