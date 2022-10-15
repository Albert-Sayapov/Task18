import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер операции 1 - добавить");
        System.out.println("Введите номер операции 2 - показать");
        System.out.println("Введите номер операции 3 - Удалить");
        System.out.println("Введите номер операции 4 - Найти");
        System.out.println("---------------------------------- ");

        while (true) {
            System.out.println("Выберите операцию");
            String line = scanner.nextLine();
            int number = Integer.parseInt(line);

            if (number == 1) {
                System.out.println("Какую покупку вы ходите добавить?");
                line = scanner.nextLine();
                list.add(line);
                System.out.println("Итого в списке покупок: " + list.size());
            } else if (number == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
            } else if (number == 3) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                line = scanner.nextLine();
                try {
                    list.remove(Integer.parseInt(line) - 1);
                } catch (NumberFormatException e) {
                    list.remove(line);
                }
            } else if (number == 4) {
                System.out.println("Введите текст для поиска");
                line = scanner.nextLine();
                System.out.println("Найдено:");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).toLowerCase().contains(line.toLowerCase()) == true) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }
                }
            }
        }
    }
}
