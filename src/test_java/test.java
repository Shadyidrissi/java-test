package test_java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Info{
	int years(int a,int b) {
		return a-b;
	}
	void users() {
		String[] user1 = {"shady","kano","2006"} ;
		String[] user2 = {"fatima","ibr","1999"} ;
		for( int i=0 ; i < user1.length ; i++) {
			System.out.println(user1[i]);
			System.out.println(user2[i]);
		}
	}
}

public class test {
    public static void main(String[] args) {
    	Info in = new Info();
    	in.users();
    	System.out.println(in.years(2024,2000)); 
        try {
            File one = new File("C:\\Users\\chadi\\OneDrive\\Desktop\\test.txt");
            Scanner read = new Scanner(one);

            if (read.hasNextLine()) {
                String vvv = read.nextLine(); // Corrected line
                System.out.println(vvv);
            } else {
                System.out.println("no");
            }

            read.close(); // Close the Scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
