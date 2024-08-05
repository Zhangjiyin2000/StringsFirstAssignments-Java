
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    String findSimpleGene(String dna, String startCodon, String stopCodon) {
        if ((dna.length() > 0) && Character.isUpperCase(dna.charAt(0)) ) {
                startCodon = startCodon.toUpperCase();
                stopCodon = stopCodon.toUpperCase();
        }
        if ((dna.length() > 0) && Character.isLowerCase(dna.charAt(0)) ) {
                startCodon = startCodon.toLowerCase();
                stopCodon = stopCodon.toLowerCase();
        }
        
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex+3);
        if (stopIndex == -1) {
            return "";
        }
        if ((stopIndex-startIndex) % 3 != 0) {
            return "";
        }
        return dna.substring(startIndex, stopIndex+3);
    }
    
    void testSimpleGene() {
        String test1 = "TAA";
        System.out.println("DNA is " + test1);
        System.out.println("result is " + findSimpleGene(test1, "ATG", "TAA"));
        String test2 = "ATG";
        System.out.println("DNA is " + test2);
        System.out.println("result is " + findSimpleGene(test2, "ATG", "TAA"));
        String test3 = "ATCGTGTCATGCTG";
        System.out.println("DNA is " + test3);
        System.out.println("result is " + findSimpleGene(test3, "ATG", "TAA"));
        String test4 = "ATGGTAGTATAA";
        System.out.println("DNA is " + test4);
        System.out.println("result is " + findSimpleGene(test4, "ATG", "TAA"));
        String test5 = "ATGGTGTATAA";
        System.out.println("DNA is " + test5);
        System.out.println("result is " + findSimpleGene(test5, "ATG", "TAA"));
        String test6 = "ATGGGTTAAGTC";
        System.out.println("DNA is " + test6);
        System.out.println("result is " + findSimpleGene(test6, "ATG", "TAA"));
        String test7 = "gatgctataat";
        System.out.println("DNA is " + test7);
        System.out.println("result is " + findSimpleGene(test7, "ATG", "TAA"));
        
    }

}
