package Example;

public class SCops {
    public static void main(String[] args) {
        int n;
        n = 0;

        if (false && (++n < 100))
            System.out.println("�� ������������" + n);
        System.out.println("if �����������: " + n);
        System.out.println("������� ");

        if (false & (++n < 100))
        System.out.println("�� ������������" + n);
        System.out.println("if �����������: " + n);

    }
}
