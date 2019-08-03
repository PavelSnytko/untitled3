
import java.util.Scanner;


class Task5 {

    public static void main(String[] args) {

        System.out.print("Введите число");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

int last= money %10;
        switch (last) {
            case 1:
                System.out.println(money + " рубль");

                break;
            case 2:
                System.out.println(money + " рубля");
                break;
            case 3:
                System.out.println(money + " рубля");
                break;
            case 4:
                System.out.println(money + " рубля");
                break;

            default:
                System.out.println(money + " рублей");
                break;
        }
    }

}