import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Lab3 {
    public static void main(String [] args) {

      String wordCount = urlToString("https://www.bls.gov/tus/charts/chart9.txt");
      int count = 0;
      for(int i =0; i <wordCount.length(); i++) {
          if(wordCount.charAt(i) == ' ') {
            count ++;
          }
      }
     System.out.println(count);

    }


    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;

    }
}
