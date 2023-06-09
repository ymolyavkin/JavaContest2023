import InputOutput.ReadInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();
            bufferedReader.close();

            int x1 = Integer.parseInt(a);
            int x2 = Integer.parseInt(b);
            System.out.println(x1 + x2);
            System.out.println(x1 * x2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*  *//**
 * Oracle Java 7
 * <p>
 * Oracle Java 8
 * <p>
 * OpenJDK Java 11 x64
 */
      /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        String[] strings = input.split(" ");

        System.out.println(Long.parseLong(strings[0]) + Long.parseLong(strings[1]));


        *//**
 * Oracle Java 8
 *//*
        int x = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vvod = br.readLine();
        String[] tok = vvod.split(" ");
        for (int i = 0; i < tok.length; i++) {
            x += Integer.parseInt(tok[i]);

        }
        System.out.println(x);
        *//**
 * OpenJDK Java 11 x64
 *//*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
            bufferedReader.close();
            String[] s2 = s.split(" ");
            int x1 = Integer.parseInt(s2[0]);
            int x2 = Integer.parseInt(s2[1]);
            System.out.println(x1 + x2);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

