import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;
        while((line = br.readLine())!= null) {
            if(line.startsWith(roll)) {
                System.out.println("Found: " + line);
                // Call python to make chart
                Runtime.getRuntime().exec("python grade_chart.py " + roll);
                System.out.println("Chart is being generated...");
            }
        }
        br.close();
    }
}