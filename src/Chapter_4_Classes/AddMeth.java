package Chapter_4_Classes;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;
// ������������ �������� ����� � ������� minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan. mpg = 21;
// ������������ �������� ����� � ������� sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar. mpg = 12;
        // ������ ��������� ������� � ������ ����� ��������
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.print("����-������ ����� ��������� " +
                minivan.passengers + " ����������. ");
        minivan.range();// ����������� ���������� � ���������
                        // ������� ����-�������
        System.out.print("���������� ���� ����� ��������� " +
                sportscar.passengers + " ����������. ");
        sportscar.range();// ����������� ���������� � ���������
                            // ������� ���������
    }
}
