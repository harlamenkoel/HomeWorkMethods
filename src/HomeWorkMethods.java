import java.time.LocalDate;
import java.util.Scanner;

public class HomeWorkMethods {
    public static void definitionLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installationSoftware(int clientOS, int clientDeviceYear) {
        String operatingSystem = "";
        switch (clientOS) {
            case 0 -> operatingSystem = "iOS";
            case 1 -> operatingSystem = "Android";
        }
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear <= currentYear) {
            System.out.println("«Установите облегченную версию приложения для " + operatingSystem + " по ссылке»");
        } else {
            System.out.println("Ссылка на скачивание приложения для " + operatingSystem);
        }

    }

    public static void calculationDaysDelivery(int deliveryDistance) {
        int minimalDeliveryTime = 1;

        if (deliveryDistance <= 19) {
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " день");
        } else if (deliveryDistance <= 59) {
            minimalDeliveryTime++;
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " дня");

        } else if (deliveryDistance <= 100) {
            minimalDeliveryTime += 2;
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " дня");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задача 1
        System.out.println("Задача 1");
        System.out.println("Вам нужно ввести год, а программа определит является он високосным или нет");

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        definitionLeapYear(year);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Вам нужно обновить приложение, для этого вам нужно ввести " +
                "вашу операционную систему и год выпуска вашего гаджета");
        System.out.println("Ваша операционная система на смартфоне:\n0.iOS;\n1.Android");

        System.out.print("Выберите свою введите 0 или 1: ");
        int clientOS = scanner.nextInt();

        System.out.print("Введите год производства вашего смартфона: ");
        int clientDeviceYear = scanner.nextInt();

        installationSoftware(clientOS, clientDeviceYear);
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");

        System.out.print("Введите растояние(км) до вас: ");
        int deliveryDistance = scanner.nextInt();

        calculationDaysDelivery(deliveryDistance);
    }
}