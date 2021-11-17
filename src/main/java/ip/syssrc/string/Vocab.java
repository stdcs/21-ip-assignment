package ip.syssrc.string;

/**
 * Vocab
 *
 * Assignment 5.2
 *
 * @author H071211045 - Muhammad Sofyan Daud Pujas <gaero38@gmail.com>
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
        String prefixUn = new String("un");
        word = word.toLowerCase();

        if (!word.startsWith(prefixUn)) {
            word = prefixUn + word;
        }
        return word;
    }

    /**
     * Add prefix for each word of groups of vocabulary words
     *
     * @param prefix the prefix to be added to each word
     * @param groups the groups of vocabulary words to be prefixed
     * @return string in the form of: `prefix :: prefixword_1 :: prefixword_2 :: ...
     *         :: prefixword_n`
     */
    public static String prefixes(String prefix, String... groups) {
        String merged = "";
        String separator = new String(" :: ");
        int opt = 1;

        for (String element : groups) {
            merged = merged.concat(prefix).concat(element);

            if (opt >= groups.length) {
                break;
            }
            merged = merged.concat(separator);
            ++opt;
        }
        return merged;
    }

    /**
     * Remove 'ness' suffix from a word
     *
     * @param word the words with suffix to be removed
     * @return string of word without 'ness' suffix
     */
    public static String removeSuffixNess(String word) {
        String SuffixNess = new String("ness");
        char[] opt = word.toCharArray();

        if (word.endsWith(SuffixNess)) {
            for (int i = opt.length - 1; i > opt.length - 5; i--) {
                opt[i] = '\0';
                /* word = word.replaceAll(SuffixNess, ""); */
            }
        }

        /*
         * if (opt[opt.length - SuffixNess.length() - 1] == 'i') { opt[opt.length -
         * SuffixNess.length() - 1] = 'y'; }
         */

        String removed = new String(opt);
        return removed;
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
        String converter = new String("en");
        String[] parts = sentence.split(" ");

        if (index < 0) {
            index = parts.length + index;
        } else if (index > parts.length - 1) { // Improved condition
            index = Math.abs(parts.length - index);
        }

        if (!parts[index].endsWith(converter)) {
            parts[index] = parts[index].concat(converter);
        }
        return parts[index];
    }
}
