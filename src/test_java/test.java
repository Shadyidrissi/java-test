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
    	Scanner input=new Scanner(System.in);
    	Info in = new Info();
    	Employer emp =new Employer();
    	System.out.println("* send data as params and data is get it from input to employer file *");
    	System.out.print("your name ?");
    	String name = input.nextLine();
    	System.out.print("your post ?");
    	String post = input.nextLine();
    	System.out.print("your salary ?");
    	String salary = input.nextLine();
    	emp.data2(name, post, salary);
    	System.out.println("* send data as params and data is in array to employer file *");
    	emp.data("shady","developer","1000$");
    	System.out.println("* show data in the same file but defferant function *");
    	in.users();
    	System.out.println("* send data to outher class but the same file *");
    	System.out.println(in.years(2024,2000)); 
    	System.out.println("* create function to show the data into file.txt *");
        try {
            File one = new File("* C:\\Users\\chadi\\OneDrive\\Desktop\\test.txt *");
            Scanner read = new Scanner(one);

            if (read.hasNextLine()) {
                String vvv = read.nextLine(); // Corrected line
                System.out.println(vvv);
            } else {
                System.out.println("no");
            }

            read.close(); // Close the Scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
