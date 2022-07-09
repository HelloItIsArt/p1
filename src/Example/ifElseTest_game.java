package Example;

public class ifElseTest_game {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch, answer = 'a';
        System.out.println("The game has a letter");
        System.out.print("Try to guess the letter: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Correct!");
        else{
            System.out.print("Sorry, you wrong. The letter is next to ");
            if(ch < answer) System.out.println("the end of our alphabet");
            else System.out.println("the start of our alphabet");
        }
    }
}
