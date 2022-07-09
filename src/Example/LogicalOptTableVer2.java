package Example;
// Упражнение 2.2
// Отображение таблицы истинности для логических операций
//          &    |   ^   !
public class LogicalOptTableVer2 {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        int count;
        for (count = 0;count <= 3; count++){

            int n = 0;
            if (p == true) {
                n++;
                System.out.print(n + "\t");
            }
            if (p == false) {
                System.out.print(n + "\t");
            }
            n = 0;
            if (q == true) {
                n++;
                System.out.print(n + "\t");
            }
            if (q == false) {
                System.out.print(n + "\t");
            }

            n = 0;
            if ((p & q) == true) {
                n++;
                System.out.print(n + "\t");
            }
            if ((p & q) == false)
                System.out.print(n + "\t");

            n = 0;
            if ((p | q) == true) {
                n++;
                System.out.print(n + "\t");
            }
            n = 0;
            if ((p | q) == false)
                System.out.print(n + "\t");

            n = 0;
            if ((p ^ q) == true) {
                n++;
                System.out.print(n + "\t");
            }
            if ((p ^ q) == false)
                System.out.print(n + "\t");

            n = 0;
            if ((!p) == true) {
                n++;
                System.out.print(n + "\t");
            }
            if ((!p) == false)
                System.out.print(n + "\t");

            if (count == 0){
                p = true;
                q = false;
            }

            if (count == 1){
                p = false;
                q = true;
            }

            if (count == 2){
                p = false;
                q = false;
            }
                System.out.println();
            }
        }
    }

