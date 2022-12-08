import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Main1 firstTask = new Main1();
        Map<Integer, String> phonebook = firstTask.phone(new HashMap<>());
        System.out.println(phonebook);
    }


    public Map<Integer, String> phone(HashMap<Integer, String> phonebook) {
        phonebook.put(123456, "Иванов");
        phonebook.put(321456, "Иванов");
        phonebook.put(234561, "Иванов");
        phonebook.put(234432, "Петрова");
        phonebook.put(654321, "Петрова");
        phonebook.put(345678, "Васильев");
        return phonebook;
    }
}

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
*/