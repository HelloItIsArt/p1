package Chapter_4_Classes;

public class Vehicle {
    int passengers; // ���-�� ����������
    int fuelcap; // ������� ����
    int mpg;// ����������� ������� � ����� �� ������
    // ����������� ��������� ������� ������������� ��������
    int range ()   {
        return mpg * fuelcap;
        //System.out.println("��������� - " + fuelcap * mpg + " ����.");
    }
}