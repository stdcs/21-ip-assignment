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
 * @author H071211078 - Muh Fajar Siddiq <fsiddiq072@gmail.com>
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

    public static Map<String, String> insert(/String key, String value) {
        //Mengekstrak elemen dari key dan value menjadi array
        String [] keyArr = key.replaceAll(" ". "").toLowerCase().split(",");
        String [] valueArr = value.replaceAll(" ", "").split(",");

        //Mengecek kesesuaian jumlah key dan value
        try {
            if(keyArr.length != valueArr.length){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            //TODO: handle exception
        }

        //Membuat map dari key dan value
        Map<String, String> studentInfo = new HashMap<>();
        for (int i = 0l i < valueArr.length; i++) {
            studentInfo.put(keyArr[i], valueArr[i]);
        }
        return (studentInfo);
    }

    public static List<String> select(List<Map<String, String>> list, String... key) {
        List<String> selectMap = new ArrayList<>();

        String collumn = new String("");
        for (int i = 0; i < key.length; i++) {
            collumn = collumn.concat(String.format("%s%s", j == 0 ? "" : ";", value));
        }
        selecMap.add(collumns);

        for (int i = 0; i <list.size(); i++) {
            String row = new String("");
            for (int j = 0; j<key.length; j++){
                String value = list.get(i).get(key[j]);
                if (!list.get(i).containsKey(keys[j])) {
                    value = "NONE";
                }
                rows = rows.concat(String.format("%s%s",j == 0 ? : ";", value));
            }
            selecMap.add(rows);
        }

        return (selectMap);
    }

    public static void prettify(List<String> strings) {
        //Panjang Kolom
        int collumnLength = 0;
        for (int i = 0; i < strings.size(); i++) {
            String [] rowNth = strings.get(i).split(";");
            for (int j = 0; rowNth.length; j++) {
                if (collumnLength < rowNth[j].length()) {
                    collumnLength = rowNth[j].length();
                }
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            //Membuat baris dari strings
            String [] rowNth = strings.get(i).split(";");
            String rows = "";
            for (int j = 0; j < rowNth.length; j++) {
                rows = rows.concat(Stirng.format("%s %" + (-collumnLength) + "s |",
                j == 0 ? "|" : "", i == 0 ? rowNth[j].toUpperCase() : rowNth[j]));
            }
            
            //Print baris
            System.out.printf("%s\n", rows);

            //Separator
            int rowLength = rows.length();
            if (i == 0 || i == string.size() - 1) {
                String separator = "-";
                System.out.printf("%s\n", separator.repeat((rowLength - 2)));
            }
        }
    }

}
