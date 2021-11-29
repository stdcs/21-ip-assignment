package ip.syssrc.string;

/**
 * Vocab
 *
 * Assignment 5.2
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class Vocab {

    public static String addPrefixUn(String word) {
        word = "Un" + word;
        return new String(word);
    }

    
    public static String prefixes(String prefix, String... groups) {
        String uni = new String(prefix + "::");

        for (int i = 0; i < groups.length; i++) {
            groups[i] = prefix.concat(groups[i]);
        }

        uni += String.join("::", groups);

        return new String(uni);
    }

    
    public static String removeSuffixNess(String word) {
        if (word.endsWith("ness")) {
            word = word.replace("ness", "");

            if (word.endsWith("i")) {
                word = word.replace("i", "y");
            }
        }
        return new String(word);
    }

    
    public static String nounToVerb(String sentence, int index) {
        String[] dum = sentence.split(" ");

        if (index == -1) {
            index = dum.length - 1;
        }

        String dom = new String(dum[index]);  

        if(dom.endsWith(".")){
            dom = dom.replace(".", "");
        }

        dom = dom.concat("en");
        
        return new String(dom);
    }
}
