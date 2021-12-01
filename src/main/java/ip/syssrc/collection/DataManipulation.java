package ip.syssrc.collection;

/**
 * DataManipulation
 *
 * Assignment 6.2
 *
 * @author H071211058 - Eka Hanny Oktavia <ekahnny@gmail.com>
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

    public static Map<String, String> insert(String keys, String args) {
        String[] keysArr = keys.replaceAll(" ", "").toLowerCase().split(",");
        String[] argsArr = args.replaceAll(" ", "").split(",");

        try {
            if (keysArr.length != argsArr.length) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        if (keysArr.length != argsArr.length) {
            throw new IllegalArgumentException("Invalid Argument.");
        }

        Map<String, String> student = new HashMap<>();
        for (int i = 0; i < argsArr.length; i++) {
            student.put(keysArr[i], argsArr[i]);
        }
        return student;
    }

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
        int colsLength = 0;
        String separator = "-";
        String header = "";
        for (int i = 0; i < strings.size(); i++) {
            String[] row = strings.get(i).split(";");
            for (int j = 0; j < row.length; j++) {
                if (colsLength < row[j].length()) {
                    colsLength = row[j].length();
                }
            }
        }
        String opt = ("| %" + (-colsLength) + "s ");
        String[] cols = strings.get(0).split(";"); 
        for (String str : cols) {
            header = header.concat(String.format(opt, str)).toUpperCase();
        }
        System.out.print(header); 
        System.out.println("|"); 
        System.out.print(" ".concat(separator.repeat(header.length() - 1)).concat("\n")); 
        for (int i = 1; i < strings.size(); i++) {
            String rows = "";
            String[] row = strings.get(i).split(";");
            for (int t = 0; t < row.length; t++) {
                rows = rows.concat(String.format(opt, row[t]));
            }
            System.out.print(rows); 
            System.out.println("|");
        }
        System.out.print(" ".concat(separator.repeat(header.length() - 1)).concat("\n")); 
    }

}