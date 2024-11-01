/*
Руководство компании решило премировать сотрудников.
Каждый team lead подал список сотрудников для получения премии.
Но получилось так, что некоторые сотрудники работают на нескольких проектах и попали в списки несколько раз.
Итак, у вас есть несколько списков сотрудников.
Ваша задача помочь получить один общий список сотрудников, но без повторов.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> teamLead1 = List.of("Евредіка Розембом","Мартін Скорсезе", "Том Круз","Мігель Фуртадо");
        List<String> teamLead2 = List.of("Марія Петрова","Олег Маслов", "Том Круз","Дмитро Браун","Неллі Альведо");
        List<String> teamLead3 = List.of("Евредіка Розембом","Марина Овєчкіна", "Карлос Торнадо","Мігель Фуртадо","Жорж Сіменон");

        // Об'єднуєм усі списки та прибираємо повтори
        Set <String> uniqueEmployeesSet = new HashSet<>();
        uniqueEmployeesSet.addAll(teamLead1);
        uniqueEmployeesSet.addAll(teamLead2);
        uniqueEmployeesSet.addAll(teamLead3);

        // виводимо список без повторів
        System.out.println(uniqueEmployeesSet);


    }
}