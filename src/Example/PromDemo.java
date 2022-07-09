package Example;

public class PromDemo {
    public static void main(String[] args) {
        int i;
        byte b = 10;
        i = b * b;
        System.out.println(i);
        b = (byte) (b *b); // без приведения выражения будет ошибка
        System.out.println("i и b: " + i + " " + b);
    }
}
