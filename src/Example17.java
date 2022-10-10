import java.util.Scanner;

public class Example17 {
    public static void main(String[] argv) {
        int hours;
        int min;
        int sec;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write hours");
        hours =  inputValue.nextInt();

        System.out.println("Write minutes");
        min = inputValue.nextInt();

        System.out.println("Write seconds");
        sec = inputValue.nextInt();

        if(sec >=0) {
            sec++;
            System.out.println(+hours+ ":" +min+ ":" +sec+  "" );

        }
    }
}
