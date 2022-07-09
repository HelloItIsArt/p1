package Chapter_4_Classes;

public class Vehicle {
    int passengers; // кол-во пассажиров
    int fuelcap; // емкость бака
    int mpg;// потребление топлива в мил€х на галлон
    // ќтображение дальности поездки транспортного средства
    int range ()   {
        return mpg * fuelcap;
        //System.out.println("ƒальность - " + fuelcap * mpg + " миль.");
    }
}