public class Monm {
    public static void main(String[] args) {
        int num = 123456;
        boolean r = false;
        for (int i = 0; i < 10; i++) {
            int count = 0; // cчетчик для текущей цифры
            int t = num; // cоздаем временную переменную temp, которая копирует значение num
            // Подсчитываем, сколько раз цифра i встречается в числе
            while (t > 0) {
                if (t % 10 == i) {
                    count++;
                }
                t = t / 10; // Убираем последнюю цифру
            }
            // Если цифра встречается более одного раза, ставим флаг
            if (count > 1) {
                r = true;
                break; // Выходим из цикла при нахождении дубликата
            }
        }
        System.out.println(!r);


    }
}




