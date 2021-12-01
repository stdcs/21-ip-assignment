package ip.syssrc.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

/**
 * TemplateParse
 *
 * Assignment 6.1
 *
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
 *
 */
public class TemplateParse {

    public static void main(String[] args) {
        String template = new String("The {alpha} {do} over the {animal}\n")
                .concat("and feels as if {who} where in {where}\n")
                .concat("of typography together with {with}.\n");

        Map<String, String> data = new HashMap<>();
        data.put("with", "Hermann Zapf");
        data.put("do", "jumps");
        data.put("alpha", "quick brown fox");
        data.put("animal", "lazy dog");
        data.put("where", "the seventh heaven");
        data.put("who", "he");

        render(parse(template, data));
    }

    /**
     * Replace all the placeholders in the template with the coreesponding values in
     * the data
     *
     * @param template the string with placeholder, placeholder is a word inside
     *                 curly braces e.g. {name}, a placeholder with "name" as key
     * @param data     the map of key-value, value is the data that will replace the
     *                 placeholder in the template, key is a placeholder without
     *                 curly braces.
     * @return list of strings with parsed placeholder
     */
    public static List<String> parse(String template, Map<String, String> data) {
        String[] str = template.split("\n");
        List<String> stringList = new ArrayList<>(Arrays.asList(str));

         /** Perulangan untuk tiap baris */
         for (int index = 0; index < stringList.size(); index++) {

            /** Perulangan untuk tiap key */
            for (String key : data.keySet()) {
                if (stringList.get(index).contains(key)) {
                    String placeholder = String.format("\\{%s\\}", key);
                    stringList.set(index,
                            stringList.get(index).replaceAll(placeholder, data.get(key)));
                }

            }
        }
        
        return new ArrayList<>();
    }

    /**
     * Print each element of template with new line
     *
     * @param template the list to be printed
     **/
    public static void render(List<String> template) {}
}
