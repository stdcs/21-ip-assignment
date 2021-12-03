package ip.syssrc.string;

/**
 * Vocab
 *
 * Assignment 5.2
 *
<<<<<<< HEAD
 * @author H071211070 - Firmansyah <frmnsyah33@gmail.com>
=======
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
 *
 */
public class Vocab {

    /**
     * Add 'un' prefixes to a word, e.g. happy -> unhappy
     *
     * @param word the word to be prefixed
     * @return string of prefixes word
     */
    public static String addPrefixUn(String word) {
<<<<<<< HEAD
        String prefixUn = new String("un");
        String prefixWord = new String(prefixUn + word);
        return new String(prefixWord);
=======
        return new String();
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
    }

    /**
     * Add prefix for each word of groups of vocabulary words
     *
     * @param prefix the prefix to be added to each word
     * @param groups the groups of vocabulary words to be prefixed
     * @return string in the form of:
     *         `prefix :: prefixword_1 :: prefixword_2 :: ... :: prefixword_n`
     */
    public static String prefixes(String prefix, String... groups) {
<<<<<<< HEAD
        String str = new String(prefix + " :: ");

        for (int i = 0; i < groups.length; i++) {
            groups[i] = prefix.concat(groups[i]);
        }

        str += String.join(" :: ", groups);
        return new String(str);
=======
        return new String();
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
    }

    /**
     * Remove 'ness' suffix from a word
     *
     * @param word the words with suffix to be removed
     * @return string of word without 'ness' suffix
     */
    public static String removeSuffixNess(String word) {
<<<<<<< HEAD
        if (word.endsWith("ness")) {
            word = word.replace("ness", "");
        }

        if (word.endsWith("i")) {
            word = word.replace(word.charAt((word.length() - 1)), 'y');
        }
        return new String(word);
=======
        return new String();
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
    }

    /**
     * Extract an adjective from a sentence and turning it into a verb
     *
     * @param sentence the sentence to be used as vocabulary word
     * @param index    the position of adjective word inside the sentence, -1 means
     *                 last position
     * @return string of extracted adjective as a verb
     */
    public static String nounToVerb(String sentence, int index) {
<<<<<<< HEAD
        String[] sentences = sentence.split(" ");
        if (index == -1) {
            index = sentences.length - 1;
        }

        String adj = new String(sentences[index]);
        if (adj.endsWith(".")) {
            adj = adj.replace(".", "");
        }

        String verb = new String(adj.concat("en"));
        return new String(verb);
=======
        return new String();
>>>>>>> 301f65a7c016f2cf0816854edea50df832a6bce7
    }
}
