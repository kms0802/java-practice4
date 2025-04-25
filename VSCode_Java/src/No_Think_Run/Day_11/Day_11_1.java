package No_Think_Run.Day_11;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
public class Day_11_1 {
    public static void main(String[]args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("문자열");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
