package ip.syssrc.collection;

import java.util.HashMap;

/**
 * DataManipulation
 *
 * Assignment 6.2
 *
 * @author H071211087 - Syarif Hidayat <syarifdayat119@gmail.com>
 *
 */
public class DataManipulation {

    public static void main(String[] args) {
        // List<Map<String, String>> student = new ArrayList<>();

        // student.add(insert("id, first_name, last_name, gender", "H071171512, Fitrah, Muhammad, Male"));
        // student.add(insert("id, first_name, last_name, gender", "H071171510, Amalia, Dwi, Female"));
        // student.add(insert("id,first_name,last_name,gender", "H071171504, Rabia,Adaw,Female"));
        // student.add(insert("id,first_name, last_name, gender", "H071171308,Babang,Arizk,Male"));

        // select(student, "first_name", "last_name").forEach(System.out::println);

        // prettify(select(student, "id", "first_name", "last_name", "gender"));

    }

    public static Map<String, String> insert(/* signatures */) {
        String[] keysArr = keys.replaceAll("","").toLowerCase().split(",");
        String[] argsArr = args.replaceAll("","").split(",");
        
        if (keysArr.length != argsArr.length){
            throw new IllegalArgumentException("invalid argument");
        }
        Map<String, String> student = new HashMap<>();
        for (int i = 0; i < argsArr.length; i++) {
            student.put(keysArr[i], argsArr[i]);
        }
        return new HashMap<>(student);
    }

    public static List<String> select(List<Map<String, String>> List, String... args) {
        List<String> selectedMap = new ArrayList<>();
        String cols = new String("");
        for (int i = 0; i < args.length; i++) {
            String separator = (i != 0) ? ";" : "";
            cols = cols.concat(String.format("%s%s", separator, values));
        }
        selectedMap.add(cols);
        for (int i = 0; i < list.size(); i++) {
            String rows = new String("");
            for (int j = 0; j < args.length; j++) {
                String values = list.get(i).get(args[j]);
                if (!list.get(i).containskey(args[j])){
                    values = "None";
                }
                String separator = (j != 0) ? ";" : "";
                rows = rows.concat(String.format("%s%s", separator, values));
            }
            selectedMap.add(rows);
        }
        return new ArrayList<>(selectedMap);
    }

    public static void prettify(List<String> strings) {
        int columnLenghth = 0;
        for (int i = 0; i < string.size(); i++) {
            String[] rowNth = strings.get(i).split(";");
            for (int j = 0; j < rowNth.length; j++) {
                if (columnLenghth < rowNth[j].length()) {
                    columnLenghth = rowNth[j].length();
                }
            } 
        }
        String formatter = "| %" + (-columnLenghth) + "s";
        String separator = "-";

        string.set(0, strings.get(0).toUpperCase());
        String[] columnName = strings.get(0).split(";");
        String firstRows = "";

        for (int i = 0; i < columnName.length; i++) {
            firstRows = firstRows.concat(String.format(formatter, columnName[i]));
        }
        int rowLength = firstRows.length() -1;
        System.out.printf("%s", firstRows);
        System.out.println("|");

        System.out.printf("%s\n", separator.repeat(rowLength));

        for (int i = 1; i < strings.size(); i++){
            String[] rowNth = strings.get(i).split(";");
            String rows = "";
            for (int j = 0; j < rowNth.length; j++) {
                rows = rows.concat(String.format(formatter, rowNth[j]));
            }
            System.out.printf("%s", rows);
            System.out.println("|");
        }
        System.out.printf("%s\n", separator.repeat(rowLength));
    }

}
