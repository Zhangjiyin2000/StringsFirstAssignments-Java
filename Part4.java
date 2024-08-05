
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.URLResource;

public class Part4 {
        
    public void findWebLinks() {
        String url = "https://www.dukelearntoprogram.com/course2/data/manylinks.html";
        URLResource ur = new URLResource(url);
        for (String word : ur.words()) {
            // process each word in turn
            //System.out.println(word);
            String lowerWord = word.toLowerCase();
            if (lowerWord.contains("youtube.com")) {
                int startIndex = lowerWord.lastIndexOf("\"", lowerWord.indexOf("youtube.com"));
                int stopIndex = lowerWord.indexOf("\"", lowerWord.indexOf("youtube.com")+1);
                if (startIndex != -1 && stopIndex != -1) {
                    String result = word.substring(startIndex+1, stopIndex);
                    System.out.println(result);
                }
                
            }
        }
        
    }
    

}
