
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    String findSimpleGene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
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
        System.out.println("result is " + findSimpleGene(test1));
        String test2 = "ATG";
        System.out.println("DNA is " + test2);
        System.out.println("result is " + findSimpleGene(test2));
        String test3 = "ATCGTGTCATGCTG";
        System.out.println("DNA is " + test3);
        System.out.println("result is " + findSimpleGene(test3));
        String test4 = "ATGGTAGTATAA";
        System.out.println("DNA is " + test4);
        System.out.println("result is " + findSimpleGene(test4));
        String test5 = "ATGGTGTATAA";
        System.out.println("DNA is " + test5);
        System.out.println("result is " + findSimpleGene(test5));
    }
    

}
