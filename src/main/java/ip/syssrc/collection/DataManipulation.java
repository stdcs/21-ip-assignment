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
 * @author H071211059 - Muhammad Erwin Arif <muherwinarif31@gmail.com>
 *
 */
public class DataManipulation {

    public static void main(String[] args) {
        // List<Map<String, String>> student = new ArrayList<>();

        // student.add(insert("id, first_name, last_name, gender", "H071171512, Fitrah, Muhammad, Male"));
        // student.add(insert("id, first_name, last_name, gender", "H071171510, Amalia, Dwi, Female"));
        // student.add(insert("id,first_name,last_name,gender", "H071171504, Rabia,Adaw,Female"));
        // student.add(insert("id,first_name, last_name, gender", "H071171308,Babang,Arizk,Male"));

    public static Map<String, String> insert(String keys, String values) {
        /** Mengekstrak elemen dari keys dan values menjadi sebuah array */
        String[] keysArr = keys.replaceAll(" ", "").toLowerCase().split(",");
        String[] valuesArr = values.replaceAll(" ", "").split(",");

        /** Mengecek kesesuaian jumlah elemen keys dan values */
        try {
            if (keysArr.length != valuesArr.length) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        /** Membuat sebuah map dari keys dan values */
        Map<String, String> studentInformation = new HashMap<>();
        for (int i = 0; i < valuesArr.length; i++) {
            studentInformation.put(keysArr[i], valuesArr[i]);
        }

        return studentInformation;
    }

    public static List<String> select(List<Map<String, String>> list, String... keys) {
         /** ArrayList untuk menyimpan elemnen per baris */
         List<String> selectedMap = new ArrayList<>();

         /** Baris dari keys (Kolom) */
         String columns = new String("");
         for (int i = 0; i < keys.length; i++) {
             columns = columns.concat(String.format("%s%s", i == 0 ? "" : ";", keys[i]));
         }
         selectedMap.add(columns);
 
         /** Baris values sesuai dengan kolom */
         for (int i = 0; i < list.size(); i++) {
             String rows = new String("");
             for (int j = 0; j < keys.length; j++) {
                 String values = list.get(i).get(keys[j]);
                 if (!list.get(i).containsKey(keys[j])) {
                     values = "NONE";
                 }
                 rows = rows.concat(String.format("%s%s", j == 0 ? "" : ";", values));
             }
             selectedMap.add(rows);
         }
 
         return selectedMap;
    }

    public static void prettify(List<String> strings) {
        /** Menghitung panjang kolom */
        int columnLength = 0;
        for (int i = 0; i < strings.size(); i++) {
            String[] rowNth = strings.get(i).split(";");
            for (int j = 0; j < rowNth.length; j++) {
                if (columnLength < rowNth[j].length()) {
                    columnLength = rowNth[j].length();
                }
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            /** Membuat baris dari elemen strings */
            String[] rowNth = strings.get(i).split(";");
            String rows = "";
            for (int j = 0; j < rowNth.length; j++) {
                rows = rows.concat(String.format("%s %" + (-columnLength) + "s |",
                        j == 0 ? "|" : "", i == 0 ? rowNth[j].toUpperCase() : rowNth[j]));
            }

            /** Print baris */
            System.out.printf("%s\n", rows);

            /** Print separator */
            int rowLength = rows.length();
            if (i == 0 || i == strings.size() - 1) {
                String separator = "-";
                System.out.printf(" %s\n", separator.repeat((rowLength - 2)));
            }
        }
    }

}
