
import java.io.BufferedReader;  
	import java.io.FileReader;  
	import java.util.ArrayList;  
	import java.util.Arrays;
  	 
	public class MostRepeatedWord {  
     	 
    	public static void main(String[] args) throws Exception {  
        	String line, word = "";  
        	int count = 0, maxCount = 0;  
        	ArrayList<String> words = new ArrayList<String>();  
    	ArrayList<String> articles = new ArrayList<String>(Arrays.asList("the", "a", "an"))
import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.ArrayList;
        import java.util.Arrays;

        public class MostRepeatedWord {

        public static void main(String[] args) throws Exception {
                String line, word = "";
                int count = 0, maxCount = 0;
                ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> articles = new ArrayList<String>(Arrays.asList("the", "a", "an"));
;

