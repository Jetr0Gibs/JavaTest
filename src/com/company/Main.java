package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите данные для подсчета: ");
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String dey = "";
        if ((st.indexOf(".") != -1) | (st.indexOf(",") != -1)){
            System.out.println("Вы ввели некорректные данные. Извените...");
        }
        else {
            String[] s = new String[2];
            s = st.split("[+-/*]");

            Pattern pattern = Pattern.compile("[+-/*]");
            Matcher matcher = pattern.matcher(st);
            while (matcher.find()) {
                dey = st.substring(matcher.start(), matcher.end());
            }

            if (s != null) {
                s[0] = s[0].trim();
                s[1] = s[1].trim();
                if ((s[0].matches("[0-9]{1,}")) && (s[1].matches("[0-9]"))) {
                    //System.out.println("grek");
                    Grek gr = new Grek();
                    System.out.println(gr.razborStrikiGrek(s[0], s[1], dey));
                } else if ((s[0].matches("[IVX]{1,}")) && (s[1].matches("[IVX]{1,}"))) {
                    //System.out.println("rom");
                    Rom rm = new Rom();
                    System.out.println(rm.razborStrikiRom(s[0], s[1], dey));
                } else {
                    System.out.println("Вы ввели некорректные данные. Извените...");
                }
            } else {
                System.out.println("Вы ввели некорректные данные. Извените...");
            }
        }

    }
}
