import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String names = "Иван Иванов " +
                "Сергей Петров " +
                "Анна Мысина " +
                "Афина Крысина " +
                "Анна Светлова " +
                "Иван Крылин " +
                "Иван Ежиков " +
                "Петр Петрецкий " +
                "Мария Русова " +
                "Марина Мышина " +
                "Анна Владимирова " +
                "Иван Пермяков " +
                "Марина Людова " +
                "Иван Звездочетов " +
                "Сергей Простов ";
        String[] listOfNames = names.split(" ");
        for (int i = 0; i < listOfNames.length; i += 2) {
            if (nameMap.containsKey(listOfNames[i])) {
                nameMap.replace(listOfNames[i], nameMap.get(listOfNames[i]) + 1);
            } else {
                nameMap.put(listOfNames[i], 1);
            }
        }

        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}

/*
 * Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет
 * на платформе) Написать программу,
 * которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */