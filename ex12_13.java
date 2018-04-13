

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	
public class ex12_13 {
	    public static void main(String[] args) {

	        if (args.length != 1) {
	            System.out.println("Invalid arguments.");
	            System.out.println("Usage: java Chapter_12.Exercise_13 filename");
	            System.exit(1); }
	        File name= new File(args[0]);
	        if (!name.exists()) {
	            System.out.println(name + " does not exist.");
	            System.exit(2);  }
	        int charcount = 0;int wordcount = 0;int linecount = 0;
	        try {
	            Scanner input = new Scanner(name);
	            while (input.hasNext()) {
	                String s = input.nextLine();
	                linecount++;
	                charcount += s.length();
	                String[] split = s.split(" ");
	                for (String word : split) {
	                    wordcount++;   }}} 
	        catch (FileNotFoundException ex) 
	        {
	            ex.printStackTrace();}
	        System.out.println("Characters: " + charcount);
	        System.out.println("Words: " + wordcount);
	        System.out.println("Lines: " + linecount);


	    }
	}
