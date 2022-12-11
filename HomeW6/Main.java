import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook noute1 = new Notebook(111, "Intel1", 10000, 4, 256, 15.6);
        Notebook noute2 = new Notebook(121, "Intel2", 11000, 4, 256, 14);
        Notebook noute3 = new Notebook(112, "Intel3", 20000, 4, 128, 15.6);
        Notebook noute4 = new Notebook(122, "Intel4", 21000, 4, 128, 15.6);
        Notebook noute5 = new Notebook(221, "Asus", 18000, 4, 128, 14);
        Notebook noute6 = new Notebook(222, "Acer", 19000, 4, 128, 15.6);
        Notebook noute7 = new Notebook(322, "HP", 30000, 4, 256, 15.6);
        Notebook noute8 = new Notebook(332, "Lenovo", 12000, 8, 256, 15.6);

        HashSet<Notebook> noteSet = new HashSet<>();
        noteSet.add(noute1);
        noteSet.add(noute2);
        noteSet.add(noute3);
        noteSet.add(noute4);
        noteSet.add(noute5);
        noteSet.add(noute6);
        noteSet.add(noute7);
        noteSet.add(noute8);
        for (Object elem : noteSet) {
            System.out.println(elem);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите критерий для проведения отбора:\n" +
                "1 - цена\n2 - объем оперативной памяти\n3 - объем жесткого диска\n4 - диагональ дисплея");
        int searchAtribut = in.nextInt();
        System.out.println("задайте диапазон (введите 2 цифры через пробел)");
        double min = in.nextDouble();
        double max = in.nextDouble();
        boolean flag = false;
        if (searchAtribut == 1) {
            for (Notebook elem : noteSet) {
                if (elem.getPrice() >= min && elem.getPrice() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 2) {
            for (Notebook elem : noteSet) {
                if (elem.getRam() >= min && elem.getRam() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 3) {
            for (Notebook elem : noteSet) {
                if (elem.getHdd() >= min && elem.getHdd() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 4) {
            for (Notebook elem : noteSet) {
                if (elem.getDiagonal() >= min && elem.getDiagonal() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Подходящих ноутбуков не найдено");
        }

    }
}

/*
  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */