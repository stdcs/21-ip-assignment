package ip.syssrc.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataManipulation
 *
 * Assignment 6.2
 *
 * @author H071171512 - Muhammad Sofyan Daud Pujas
 *         <pujasmsd21h@student.unhas.ac.id>
 *
 */
public class DataManipulation {

    public static void main(String[] args) {
        
        // List<Map<String, String>> student = new ArrayList<>();
        // TRY 1
        /*
         * student.add(insert("id, first_name, last_name, gender",
         * "H071171512, Fitrah, Muhammad, Male"));
         * student.add(insert("id, first_name, last_name, gender",
         * "H071171510, Amalia, Dwi, Female"));
         * student.add(insert("id, first_name,last_name,gender",
         * "H071171504, Rabia,Adaw,Female"));
         * student.add(insert("id, first_name, last_name, gender",
         * "H071171308,Babang,Arizk,Male"));
         * 
         * select(student, "first_name", "last_name").forEach(System.out::println);
         * prettify(select(student, "id", "first_name", "last_name", "gender"));
         * select(student, "first_name", "i").forEach(System.out::println);
         */

        // TRY 2
        /*
         * student.add(insert("id, first_name, last_name, gender",
         * "H071171512, Fitrah, Muhammad, Male"));
         * student.add(insert("id, first_name, last_name, gender",
         * "H071171510, Amalia, Dwi, Female"));
         * student.add(insert("id,first_name,last_name,gender",
         * "H071171504, Rabia,Adaw,Female"));
         * student.add(insert("id,first_name, last_name, gender",
         * "H071171308,Babang,Arizk,Male"));
         * 
         * select(student, "first_name", "last_name", "i").forEach(System.out::println);
         * System.out.println();
         * prettify(select(student, "id", "first_name", "last_name", "gender"));
         */

    }

    public static Map<String, String> insert(String keys, String args) {
        String[] keysArr = keys.replaceAll(" ", "").toLowerCase().split(",");
        String[] argsArr = args.replaceAll(" ", "").split(",");

        try {
            if (keysArr.length != argsArr.length) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        Map<String, String> student = new HashMap<>();
        for (int i = 0; i < argsArr.length; i++) {
            student.put(keysArr[i], argsArr[i]);
        }
        return student;
    }

    public static List<String> select(List<Map<String, String>> list, String... args) {
        List<String> selectedMap = new ArrayList<>();

        String cols = new String("");
        for (int i = 0; i < args.length; i++) {
            String separator = (i != 0) ? ";" : "";
            cols = cols.concat(String.format("%s%s", separator, args[i]));
        }
        selectedMap.add(cols);

        for (int i = 0; i < list.size(); i++) {
            String rows = new String("");
            for (int j = 0; j < args.length; j++) {
                String values = list.get(i).get(args[j]);
                if (!list.get(i).containsKey(args[j])) {
                    values = "NONE";
                }
                String separator = (j != 0) ? ";" : "";
                rows = rows.concat(String.format("%s%s", separator, values));
            }
            selectedMap.add(rows);
        }
        return selectedMap;
    }

    public static void prettify(List<String> strings) {
        int rowLength = 0;
        int colsLength = 0;
        String separator = "-";

        for (int i = 0; i < strings.size(); i++) {
            String[] row = strings.get(i).split(";");
            for (int j = 0; j < row.length; j++) {
                if (colsLength < row[j].length()) {
                    colsLength = row[j].length();
                }
            }
        }

        for (int i = 0; i < strings.size(); i++) {

            String opt = "";
            String rows = "";
            String[] row = strings.get(i).split(";");

            opt = "%s ".concat("%" + Integer.toString(-colsLength)).concat("%s |");

            for (int t = 0; t < row.length; t++) {
                rows = rows.concat(String.format(opt, t != 0 ? "" : "|", i != 0 ? row[t] : row[t].toUpperCase()));
            }
            rowLength = rows.length();
        }

        System.out.println(" ".concat(separator.repeat(rowLength - 2)));

    }
}
