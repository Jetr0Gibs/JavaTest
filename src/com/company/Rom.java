package com.company;

import java.util.HashMap;
import java.util.Map;

public class Rom {
    public int razborStrikiRom (String a, String b, String deistvie) {
        int res = 0;

        Map<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("I", "1");
        dictionary.put("II", "2");
        dictionary.put("III", "3");
        dictionary.put("IV", "4");
        dictionary.put("V", "5");
        dictionary.put("VI", "6");
        dictionary.put("VII", "7");
        dictionary.put("VIII", "8");
        dictionary.put("IX", "9");
        dictionary.put("X", "10");

        a = dictionary.get(a);
        b = dictionary.get(b);

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
