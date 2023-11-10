package lab13;

public class Test {
    public static void main(String[] args) {
        String myString = "Hello, World!";

        boolean endsWithExclamation = myString.endsWith("!!!");

        if (endsWithExclamation) {
            System.out.println("Строка заканчивается подстрокой '!!!'");
        } else {
            System.out.println("Строка НЕ заканчивается подстрокой '!!!'");
        }
    }
}
