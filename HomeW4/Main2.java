class Node {
    int data;     
    Node next;    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
class Queue {
    private static Node rear = null, front = null;
    private static int count = 0;
 
    public static int dequeue() {
        if (front == null) {
            System.out.println("\nНеисполнение очереди");
            System.exit(-1);
        }
 
        Node temp = front;
        System.out.printf("Удален %d\n", temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count -= 1;
        return temp.data;
    }
 
    public static void enqueue(int item) {
        Node node = new Node(item);
        System.out.printf("Перемещен %d\n", item);
        if (front == null) {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
        count += 1;
    }
 
    public static int peek() {
        if (front == null) {
            System.exit(-1);
        }
        return front.data;
    }
 
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
 
    private static int size() {
        return count;
    }
}
 
class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
 
        System.out.printf("Первый элемент %d\n", q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
 
        if (q.isEmpty()) {
            System.out.println("Очередь пуста");
        }
        else {
            System.out.println("Очередь не пуста");
        }
    }
}
