package org;

public class Convert {
    /**
     * метод конвертирует число из десятичной системы исчисления в любую другую
     *
     * @param nb   - подаваемое число
     * @param base - система исчисления
     * @return - число в нужной системе исчисления
     */
    public String itoBase(int nb, String base) {
        int notation = getBaseValue(base);

        if (nb <= 0) {
            System.out.println("Число должно быть больше 0");
        }
        if (notation == -1) {
            System.out.println("Неверная система счисления. Пример ввода: «01» - двоичная, «012» - троичная, «0123456789abcdef» - шеснадцатиричная и т.д.");
        }

        int b;
        String temp = "";

        while (nb != 0) {
            b = nb % notation;

            temp = Character.forDigit(b, notation) + temp;

            nb = nb / notation;
        }
        return temp;
    }

    /**
     * метод возращает систему исчисления в виде числа
     *
     * @param base - система исчисления в виде строки типа 0123456789abcdef
     * @return - числовое значение системы исчисления
     */
    public int getBaseValue(String base) {
        char[] baseChar = base.toCharArray();
        int count = 1;

        if (Character.getNumericValue(baseChar[0]) != 0) {
            return -1;
        }

        for (int i = 0; i < baseChar.length - 1; i++) {
            if (Character.getNumericValue(baseChar[i]) + 1 == Character.getNumericValue(baseChar[i + 1])) {
                count++;
            } else return -1;

        }
        return count;
    }
}
