package InputOutput;

import java.io.*;

public class WriteOutput {
    /**
     * https://yandex.ru/support/contest/examples-file.html
     * Oracle Java 7
     *
     * @throws IOException
     */
    public static void writeToFileJava7() throws IOException {
        String s;
        String result = null;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            while ((s = br.readLine()) != null) {
                String[] arr = s.split(" ");
                Long a = Long.parseLong(arr[0]);
                Long b = Long.parseLong(arr[1]);
                result = String.valueOf(a + b);
                System.out.println(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            bw.write(result);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    /**
     * Oracle Java 8
     *
     * @throws IOException
     */
    public static void writeToFileJava8() throws IOException {
        StreamTokenizer in = new StreamTokenizer(
                new BufferedInputStream(
                        new FileInputStream(new File("input.txt"))));
        PrintStream out = new PrintStream(new File("output.txt"));
        int a, b;
        in.nextToken();
        a = (int) in.nval;
        in.nextToken();
        b = (int) in.nval;
        out.println(a + b);
    }

    /**
     * OpenJDK Java 11 x64
     *
     * @throws IOException
     */
    public static void writeToFileJava11() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String file = reader.readLine();
        String[] nums = file.split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }
        FileWriter writer = new FileWriter("output.txt");
        writer.write(String.valueOf(sum));
        writer.flush();
    }
}
