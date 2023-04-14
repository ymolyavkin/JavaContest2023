package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {
    public static List<Long> readInputJava7() throws IOException {
        /**
         * Oracle Java 7
         */
        List<Long> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        String[] strings = input.split(" ");
        for (String s : strings) {
            result.add(Long.parseLong(s));
        }
        //System.out.println(Long.parseLong(strings[0]) + Long.parseLong(strings[1]));

        return result;
    }

    /**
     * Oracle Java 8
     */
    public static List<Long> readInputJava8() throws IOException {
        List<Long> result = new ArrayList<>();
        int x = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vvod = br.readLine();
        String[] tok = vvod.split(" ");
        for (int i = 0; i < tok.length; i++) {
            result.add(Long.parseLong(tok[i]));
        }

        return result;
    }


    /**
     * OpenJDK Java 11 x64
     */
    public static List<Long> readInputJava11() {
        List<Long> result = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            String[] strings = line.split(" ");

            for (String s : strings) {
                result.add(Long.parseLong(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
