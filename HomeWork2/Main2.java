package JavaHomeWork.HomeWork2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Task task = new Task();
        task.Print(task.Sort(task.Taskt()));
    }
}

class Task {
    int n;
    int[] array;

    int[] Taskt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        n = input.nextInt();
        array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i=0; i<array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("\n");
        return array;
    }

    int[] Sort(int[] array) {  
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;    
    }

    void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
