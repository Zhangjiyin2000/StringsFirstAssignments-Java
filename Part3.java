
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    boolean twoOccurrences(String stringa, String stringb) {
        int occurr1 = stringb.indexOf(stringa);
        if (occurr1 == -1) {
            return false;
        }
        int stringaLen = stringa.length();
        int occurr2 = stringb.indexOf(stringa, occurr1+stringaLen);
        if (occurr2 != -1) {
            return true;
        } else {
            return false;
        }
        
        
    }
    
    void testing() {
        String stringa1 = "by";
        System.out.println("stringa = " + stringa1);
        String stringb1 = "A story by Abby Long";
        System.out.println("stringb = " + stringb1);
        System.out.println(twoOccurrences(stringa1, stringb1));
        
        String stringa2 = "a";
        System.out.println("stringa = " + stringa2);
        String stringb2 = "banana";
        System.out.println("stringb = " + stringb2);
        System.out.println(twoOccurrences(stringa2, stringb2));
        
        String stringa3 = "atg";
        System.out.println("stringa = " + stringa3);
        String stringb3 = "ctgtatgta";
        System.out.println("stringb = " + stringb3);
        System.out.println(twoOccurrences(stringa3, stringb3));
        
        String stringa4 = "an";
        String stringb4 = "banana";
        System.out.println("The part of the string after " + stringa4 + " in " + stringb4 + "is " + lastPart(stringa4, stringb4) + ".");
        
        String stringa5 = "zoo";
        String stringb5 = "forest";
        System.out.println("The part of the string after " + stringa5 + " in " + stringb5 + "is " + lastPart(stringa5, stringb5) + ".");
    }
    
    String lastPart(String stringa, String stringb) {
        String result = "";
        int firstOccurr = stringb.indexOf(stringa);
        int stringaLen = stringa.length();
        if (firstOccurr == -1 ) {
            return stringb;
        } else {
            result = stringb.substring(firstOccurr+stringaLen);
            return result;
        }
        
    }

}
