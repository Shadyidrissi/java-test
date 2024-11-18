package test_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            File one = new File("C:\\Users\\chadi\\OneDrive\\Desktop\\test.txt");
            Scanner read = new Scanner(one);
            System.out.println(read);
            if (read.hasNextLine()) {
                String vvv = read.nextLine(); // Corrected line
                System.out.println(vvv);
            } else {
                System.out.println("no");
            }


    }
}
