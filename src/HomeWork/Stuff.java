package HomeWork;

public class Stuff {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        int i = 0;
        do {
            ch = (char) System.in.read();

            if (ch >= 'a' & ch <= 'z') { ch = (char) (ch - 32); i++;}
            else if (ch >= 'A' & ch <= 'Z') { ch = (char) (ch + 32); i++;};

            do {ignore = (char) System.in.read();}
            while (ignore != '\n');

            }while (ch != '.');
        System.out.println("Quantity of converts is " + i);
    }
}