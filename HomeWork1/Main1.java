package JavaHomeWork.HomeWork1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Task mySum = new Task();
        System.out.println(mySum.NewSum());
        Tasker myWork = new Tasker();
        System.out.println(myWork.NewWork());
    }
}

/*
    Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

class Task {
    int n;
    int sum;

    int NewSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        n = input.nextInt();
        sum = 0;
        for (int i=0; i<=n; i++) {
            sum += i;
        }
    return sum; 
    } 
}

class Tasker {
    int k;
    int work;

    int NewWork() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        k = input.nextInt();
        work = 1;
        for (int i=1; i<=k; i++) {
            work = work * i;
        }
        input.close();
    return work; 
    }
}