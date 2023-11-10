package lab13;

public class LastSymbol {
    public static void main(String[] args) {

        String myString = "Hello, World!";

        int length = myString.length();

        if (length > 0) {
            char lastChar = myString.charAt(length - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Строка пуста, нет последнего символа.");
        }
    }
}
