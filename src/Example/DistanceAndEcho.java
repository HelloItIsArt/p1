package Example;

public class DistanceAndEcho {
    public static void main(String[] args) {
        double time, speed, distance, time_to_object;
        time = 10;
        time_to_object = time / 2;
        speed = 330;
        distance = time_to_object * speed;
        System.out.println("the distance between you and an object is " + distance + " m");
    }
}
