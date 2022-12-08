public class Main3 {
    public static void main(String[] args) {
        System.out.println(transformNumber("MMXXII"));
    }

    private static int letterToNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static int transformNumber(String roman) {
        int integerValue = 0;

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            int number = letterToNumber(ch);
            if (number == -1) {
                throw new NumberFormatException("Неверный формат");
            }

            if (i + 1 < roman.length()) {
                int nextNumber = letterToNumber(roman.charAt(i + 1));
                if (nextNumber > number) {
                    integerValue += (nextNumber - number);
                    i++;
                } else {
                    integerValue += number;
                }
            } else {
                integerValue += number;

            }
        }
        return integerValue;
    }
}

/*
 * Написать метод, который переведет число из римского формата записи в
 * арабский.
 * Например, MMXXII = 2022 (правила см. во вложениях к уроку, где ссылка на
 * репозиторий).
 */
