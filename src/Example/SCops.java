package Example;

public class SCops {
    public static void main(String[] args) {
        int n;
        n = 0;

        if (false && (++n < 100))
            System.out.println("не отображается" + n);
        System.out.println("if выполняется: " + n);
        System.out.println("пропуск ");

        if (false & (++n < 100))
        System.out.println("не отображается" + n);
        System.out.println("if выполняется: " + n);

    }
}
