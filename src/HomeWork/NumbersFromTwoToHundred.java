package HomeWork;

public class NumbersFromTwoToHundred {
    public static void main(String[] args) {
        int count, n;
        n = 0;
        for (count = 2; count <=100; count++){
            boolean check = false;
            if (count == 2){
                check = true;
                System.out.print(count + " ");
            }
            if ((count % 2 != 0) & (count / count == 1)){
                System.out.print(count + " ");
                check = true;
            }
            if (check == true)
                n++;
            if (n == 10){
                System.out.println();
                n = 0;
            }
        }
    }
}
