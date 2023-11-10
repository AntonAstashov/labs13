package lab13;

public class ILikeJava {
    public static void processString(String inputString) {
        System.out.println("Длина строки: " + inputString.length());

        System.out.println("Преобразованная строка: " + inputString.toUpperCase());
    }

    public static void main(String[] args) {

        processString("I like Java!!!");

    }

}
