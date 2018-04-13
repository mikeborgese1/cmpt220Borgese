	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.util.Scanner;

public class ex12_11 {
	    public static void main(String[] args) {

	        if (args.length != 2) {
	            System.out.println("Invalid arguments.");
	            System.out.println("Usage: java Chapter_12.Exercise_11 word filename");
	            System.exit(1);
	        }
	        File name = new File(args[1]);
	        if (!name.exists()) {
	            System.out.println(args[1] + " does not exist.");
	            System.out.println(2);
	        }       
	        String a = "";
	        try {
	            Scanner input = new Scanner(name);
	            while (input.hasNext()) {
	                a += input.nextLine();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        a = a.replaceAll(args[0], "");
	        try {
	            PrintWriter output = new PrintWriter(name);
	            System.out.println(a);
	            output.write(a);
	            output.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Complete");
	    }
	}

