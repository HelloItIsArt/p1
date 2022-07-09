package Example;

public class postfix_prefix {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        System.out.println("x= "+ x + " y= "+ y);
        x = 10;
        y = x++;
        System.out.println("x= "+ x + " y= "+ y);
        }
}
