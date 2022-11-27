package JavaHomeWork.HomeWork1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
       double num1;
       double num2;
       double result;
       char option;
       Scanner input = new Scanner(System.in);
       System.out.print("Введите 2 числа: ");
       num1 = input.nextDouble();
       num2 = input.nextDouble();
       System.out.print("\nВведите операцию (+, -, *, /): ");
       option = input.next().charAt(0);
       input.close();
       switch(option) {
          case '+': result = num1 + num2;
             break;
          case '-': result = num1 - num2;
             break;
          case '*': result = num1 * num2;
             break;
          case '/': result = num1 / num2;
             break;
          default:  System.out.printf("Ошибка! Введен некорректный знак операции");
             return;
       }
       System.out.print("\nРезультат операции:\n");
       System.out.printf(num1 + " " + option + " " + num2 + " = " + result);
    }
 }
/*
  Реализовать простой калькулятор
*/