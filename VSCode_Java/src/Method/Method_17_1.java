package Method;

public class Method_17_1 {
    public static void main(String[]args){
        String text = "Hello";
        System.out.println(text.length());

        System.out.println("Java".charAt(1));

        String word = "banana";
        System.out.println(word.substring(1, 4));

        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));

        String name = "김철수";
        System.out.println(name.contains("철"));

        String input = "     hi     ";
        System.out.println(input.trim());

        System.out.println("java".toUpperCase());
        System.out.println("JAVA".toLowerCase());

        System.out.println(Math.abs(-5));

        System.out.println(Math.max(8, 15));
        System.out.println(Math.min(8, 15));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.sqrt(16));

        double r = Math.random();
        System.out.println(r);
    }
}
