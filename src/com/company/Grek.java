package com.company;

public class Grek {
    public int razborStrikiGrek (String a, String b, String deistvie) {
        int res = 0;
        if (deistvie.equals("+")){
            //Сложение
            arifmetic ar = new arifmetic();
            res = ar.slogenie(Integer.parseInt(a),Integer.parseInt(b));
        }
        else if (deistvie.equals("-")){
            //Вычитание
            arifmetic ar = new arifmetic();
            res = ar.raznost(Integer.parseInt(a),Integer.parseInt(b));
        }
        else if (deistvie.equals("*")){
            //Умножение
            arifmetic ar = new arifmetic();
            res = ar.ymnozhenie(Integer.parseInt(a),Integer.parseInt(b));
        }
        else {
            //Деление
            arifmetic ar = new arifmetic();
            res = ar.delenie(Integer.parseInt(a),Integer.parseInt(b));
        }
        return res;
    }
}
