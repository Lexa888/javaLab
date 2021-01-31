package org;

public class Main {

    public static void main(String[] args) {
        Convert convert = new Convert();

        System.out.println(convert.itoBase(Integer.parseInt(args[0]), args[1]));
    }
}
