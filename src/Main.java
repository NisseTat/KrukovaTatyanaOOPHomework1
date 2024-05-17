/**
 * Абстракция
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
 * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 */

/**
 * Инкапсуляция
 * Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
 * сделанного в предыдущем задании.
 */

/**
 * Наследование
 * Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
 * сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата
 * (пример: ПродающийБутылкиВодыАвтомат)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;


/**
 * Полиморфизм
 * Переопределите метод toString для Товара, запустите программу, после этого переопределите для
 * наследника этот метод, после запуска обратите внимание на изменение поведения.
 * Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
 * входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
 * возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)
 */


public class Main {

    static HotDrinksVendingMachine cacao_and_matcha_machine;
    static HotDrinksVendingMachine tea_machine;
    static HotDrinksVendingMachine coffee_machine;
    static Scanner scanner = new Scanner(System.in);
    static int difference_200_300 = 20;

    public static void main(String[] args) {
        fullMachines ();
        runProgram();
    }

    private static void fullMachines() {
        HotDrink cacao_warm = new HotDrink("Какао", 100,80);
        HotDrink cacao_hot = new HotDrink("Какао", 80,100);

        HotDrink matcha_warm = new HotDrink("Матча", 100,80);
        HotDrink matcha_hot = new HotDrink("Матча", 80,100);

        HotDrink latte_warm = new HotDrink("Латте", 120,80);
        HotDrink latte_hot = new HotDrink("Латте", 100,100);

        HotDrink capuchino_warm = new HotDrink("Капучино", 100,80);
        HotDrink capuchino_hot = new HotDrink("Капучино", 80,100);

        HotDrink americano_warm = new HotDrink("Американо", 80,80);
        HotDrink americano_hot = new HotDrink("Американо", 80,100);

        HotDrink black_tea_warm = new HotDrink("Черный чай", 50,80);
        HotDrink black_tea_hot = new HotDrink("Черный чай", 50,100);

        HotDrink green_tea_warm = new HotDrink("Зеленый чай", 50,80);
        HotDrink green_tea_hot = new HotDrink("Зеленый чай", 50,100);

        HotDrink herbal_tea_warm = new HotDrink("Травяной чай", 50,80);
        HotDrink herbal_tea_hot = new HotDrink("Травяной чай", 50,100);

        List<HotDrink> cacao_and_matcha = new ArrayList<>();
        List<HotDrink> tea = new ArrayList<>();
        List<HotDrink> coffee = new ArrayList<>();

        cacao_and_matcha.add(cacao_warm);
        cacao_and_matcha.add(cacao_hot);
        cacao_and_matcha.add(matcha_warm);
        cacao_and_matcha.add(matcha_hot);

        tea.add(black_tea_warm);
        tea.add(black_tea_hot);
        tea.add(green_tea_warm);
        tea.add(green_tea_hot);
        tea.add(herbal_tea_warm);
        tea.add(herbal_tea_hot);

        coffee.add(latte_warm);
        coffee.add(latte_hot);
        coffee.add(capuchino_warm);
        coffee.add(capuchino_hot);
        coffee.add(americano_warm);
        coffee.add(americano_hot);

        cacao_and_matcha_machine = new HotDrinksVendingMachine (cacao_and_matcha);
        tea_machine = new HotDrinksVendingMachine (tea);
        coffee_machine = new HotDrinksVendingMachine (coffee);
    }

    private static void runProgram() {
        while (true) {
            System.out.printf("Выберите автомат: \n" +
                    "1. Какао и матча \n" +
                    "2. Чай \n" +
                    "3. Кофе \n" +
                    "Введите 0 для выхода"
            );
            System.out.printf("Введите номер автомата: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) break;

            switch (number) {
                case (1):
                    cacao_and_matcha_machine();
                    break;
                case (2):
                    tea_machine();
                    break;
                case (3):
                    coffee_machine();
                    break;
                default:
                    System.out.printf("Неверное значение номера автомата");
                    break;
            }

        }
    }

    private static void cacao_and_matcha_machine () {
        while (true) {
            System.out.printf("\n\nВыберите напиток: \n");
            int count = 1;
            for (int i = 0; i < cacao_and_matcha_machine.getProductList().size(); i += 2) {
                System.out.printf("%d %s \n", count, cacao_and_matcha_machine.getProductList().get(i));
                count += 1;
            }
            System.out.printf("Введите номер напитка: ");
            int number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case (1):
                case (2):
                case (3):
                case (4):
                    choose_volume(cacao_and_matcha_machine, cacao_and_matcha_machine.getProductList().get(number*2 - 1).getName());
                    break;
                default:
                    break;
            }

            break;
        }
    }

    private static void tea_machine () {
        while (true) {
            System.out.printf("\n\nВыберите напиток: \n");
            int count = 1;
            for (int i = 0; i < tea_machine.getProductList().size(); i += 2) {
                System.out.printf("%d %s \n", count, tea_machine.getProductList().get(i));
                count += 1;
            }
            System.out.printf("Введите номер напитка: ");
            int number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case (1):
                case (2):
                case (3):
                case (4):
                case (5):
                case (6):
                    choose_volume(tea_machine, tea_machine.getProductList().get(number*2 - 1).getName());
                    break;
                default:
                    break;
            }

            break;
        }
    }

    private static void coffee_machine () {
        while (true) {
            System.out.printf("\n\nВыберите напиток: \n");
            int count = 1;
            for (int i = 0; i < coffee_machine.getProductList().size(); i += 2) {
                System.out.printf("%d %s \n", count, coffee_machine.getProductList().get(i));
                count += 1;
            }
            System.out.printf("Введите номер напитка: ");
            int number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case (1):
                case (2):
                case (3):
                    choose_volume(coffee_machine, coffee_machine.getProductList().get(number*2 - 1).getName());
                    break;
                default:
                    break;
            }

            break;
        }
    }

    private static void choose_volume (HotDrinksVendingMachine machine, String drink_name) {
        System.out.printf("Выберите необходимую температуру напитка: \n" +
                "1. Теплый (80 градусов)\n" +
                "2. Горячий (100 градусов)\n");
        int number_temp = Integer.parseInt(scanner.nextLine());
        int temp = 0;

        switch (number_temp) {
            case (1):
                temp = 80;
                break;
            case (2):
                temp = 100;
                break;
            default:
                System.out.printf("Неверное значение");
                break;
        }

        System.out.printf("Выберите необходимый объем: \n" +
                "1. 200 мл\n" +
                "2. 300 мл\n");
        int number = Integer.parseInt(scanner.nextLine());

        int volume = 0;
        switch (number) {
            case (1):
                volume = 200;
//                machine.setMoney(drinkPrice);
                break;
            case (2):
                volume = 300;
//                machine.setMoney(drinkPrice + difference_200_300);
                break;
            default:
                System.out.printf("Неверно введено значение");
                break;
        }

        HotDrink drink = machine.getProduct(drink_name, volume, temp);

        int price = drink.getPrice();
        if (volume == 300) price += difference_200_300;

        System.out.printf("Вы выбрали " + drink +
                ", " + volume + " мл \n" +
                "Сумма вашей покупки: " + String.valueOf(price) +
                " рублей \n\n");
    }
}

