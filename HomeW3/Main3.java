public class Main3 {
    public static void main(String[] args) {

        int[] ArrayList = new int[]{12, 15, 65, 20, 5, 1, 8};

        int max = ArrayList[0]; // Массив не должен быть пустым
        int min = ArrayList[0];
        double avg = 0;
        for (int i = 0; i < ArrayList.length; i++) {
            if(max < ArrayList[i])
                max = ArrayList[i];
            if(min > ArrayList[i])
                min = ArrayList[i];
            avg += ArrayList[i]/ArrayList.length;
        }

        System.out.println("максимальное = " + max);
        System.out.println("минимальное = " + min);
        System.out.println("среднее = " + avg);
    } 
}

/*
   Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */