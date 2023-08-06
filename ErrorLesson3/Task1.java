/*Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных: для упрощения можно все форматы принимать как String.
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m. //char

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки или бросить исключение, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом. 

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки. */



package ErrorLesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
        // Запрашиваем данные у пользователя
        System.out.println("Введите данные в следующем порядке: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол");
        String inputData = scanner.nextLine();

        // Разделяем данные по пробелу
        String[] data = inputData.split(" ");

        // Проверяем количество данных
        if (data.length != 6) {
            System.out.println("Неверное количество данных");
            continue;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        try {
            validateDataFormat(birthDate, phoneNumber, gender);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            continue;
        }

        String userData = surname + " " + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender;

        try (FileWriter writer = new FileWriter(surname + ".txt", true)) {
            // Записываем данные в файл
            writer.write(userData);
            writer.write(System.lineSeparator());
            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

        break;
    }
}

private static void validateDataFormat(String birthDate, String phoneNumber, String gender) throws Exception {
    if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
        throw new Exception("Неверный формат даты рождения");
    }

    if (!phoneNumber.matches("\\d+")) {
        throw new Exception("Неверный формат номера телефона");
    }

    if (!gender.matches("[mf]")) {
        throw new Exception("Неверный формат пола");
    }
}

}