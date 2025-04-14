package No_Think_Run;

import java.util.ArrayList;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class Day_3 {
    public static void main(String[]args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s.toUpperCase());
        }

        Box<String> stringBox = new Box<>();
        stringBox.set("사과");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
