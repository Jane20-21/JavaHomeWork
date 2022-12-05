import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Strit");
        linkedList.add("Home");
        linkedList.add("Number");
        linkedList.add("Town");
        System.out.println("Список до преобразования: " + linkedList);
        linkedList = reverseLinkedList(linkedList);
        System.out.println("Перевернутый список: " + linkedList);
    }
  
    public static LinkedList<String> reverseLinkedList(LinkedList<String> list)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }
}
