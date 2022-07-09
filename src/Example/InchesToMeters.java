package Example;

public class InchesToMeters {
    public static void main(String[] args) {
        double meter, inch;
        int counter;
        counter = 0;
        for (inch = 1; inch <= 144; inch++){
            meter = inch / 39.37; // подсчет метров в дюйме
            System.out.println(inch + " inch = " +
                                meter + " meter.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
