package Chapter_4_Classes;

public class Vehicle {
    int passengers; // кол-во пассажиров
    int fuelcap; // емкость бака
    int mpg;// потребление топлива в милях на галлон
    // Отображение дальности поездки транспортного средства
    int range ()   {
        return mpg * fuelcap;
        //System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }
}