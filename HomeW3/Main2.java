import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList <Integer>();

       number.add(1);
       number.add(5);
       number.add(8);
       number.add(2);
       number.add(9);
       number.add(20);
       number.add(11);

       number.removeIf(num -> num%2==0);

       System.out.println(number);

    }   
}

/*
   Пусть дан произвольный список целых чисел, удалить из него четные числа
 */