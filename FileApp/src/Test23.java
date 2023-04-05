//file operations // no. of words in multithread.txt
import java.io.*;
public class Test23 {
	public static void main(String[] args) throws Exception{
       File source = new File("C:\\sunil\\multithread.txt");
       FileReader fr=new FileReader(source);
       BufferedReader br=new BufferedReader(fr);
       String s;
       String[] words,sents;
       int wordcount=0,sentencecount=0,charactercount=0;
      while(( s=br.readLine())!=null) {
    	 words= s.split("[\\s+]");
    	 wordcount=wordcount+words.length;
    	 sents= s.split("\n");
    	 sentencecount=sentencecount+sents.length;
    	 charactercount=charactercount+s.length();
    	 System.out.println(sentencecount+" "+s);
    	 
      }
  System.out.println("No. of words in essay is "+wordcount);
  System.out.println("No. of sents in essay is "+sentencecount);
  System.out.println("No. of characters in essay is "+charactercount);
	}

}
