package java_test_code;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class UniqueWords2 {
	
	 public Set<String> getDistinctWordList(String fileName){
		 
	        FileInputStream fis = null;
	        DataInputStream dis = null;
	        BufferedReader br = null;
	        Set<String> uniqueWords = new HashSet<String>();
	        try {
	            fis = new FileInputStream(fileName);
	            dis = new DataInputStream(fis);
	            br = new BufferedReader(new InputStreamReader(dis));
	            String line = null;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
	                while(st.hasMoreTokens()){
	                    String word = st.nextToken().toLowerCase();
	                    uniqueWords.add(word);
	                }
	            	
	            }
	            
	            for (String word : uniqueWords) {
	                System.out.println(word);
	             }
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{if(br != null) br.close();}catch(Exception ex){}
	        }
	        return uniqueWords;
	    }
	     
	    public static void main(String a[]){
	         
	    	UniqueWords2 obj = new UniqueWords2();
	         obj.getDistinctWordList("sample.txt");
	        
	}



}
