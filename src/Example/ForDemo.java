package Example;

public class ForDemo {
    public static void main(String[] args) {
        int count;
        int n = 0;
        for (count = 0;count < 5; count++){
            if (count < 5) n++;
            System.out.println("Итерация "+ n + " = " + count);}
            //System.out.println("Итерация "+ "= " + count);}

        System.out.println("Готово!");
    }
}
