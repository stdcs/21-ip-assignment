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
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class DataManipulation {

    public static void main(String[] args) {
        List<Map<String, String>> student = new ArrayList<>();
        
        student.add(insert("id, first_name, last name, gender", "H071171512, Fitrah, Muhammad, Male"));
        student.add(insert("id, first_name, last name, gender", "H071171510, Amalia, Dwi, Female"));
        student.add(insert("id, first_name, last name, gender", "H071171512, Rabia, Adaw, Male"));
        student.add(insert("id, first_name, last name, gender", "H071171308, Babang, Arizk, Male"));
        // student.add(insert("id, first_name, last_name, gender", "H071171512, Fitrah, Muhammad, Male"));
        // student.add(insert("id, first_name, last_name, gender", "H071171510, Amalia, Dwi, Female"));
        // student.add(insert("id,first_name,last_name,gender", "H071171504, Rabia,Adaw,Female"));
        // student.add(insert("id,first_name, last_name, gender", "H071171308,Babang,Arizk,Male"));
        select(student, "first_name", "last_name").forEach(System.out::println);
        System.out.println();
        prettify(select(student, "id", "first_name", "last_name", "gender"));
        // select(student, "first_name", "last_name").forEach(System.out::println);

        // prettify(select(student, "id", "first_name", "last_name", "gender"));

    }

    public static Map<String, String> insert(String keys, String values) {
        String[] keysArr = keys.replaceAll(" ", "").toLowerCase().split(",");
        String[] valuesArr = values.replaceAll(" ", "").split(",");
        
        try{
            if (keysArr.length != valuesArr.length){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        Map<String, String> studentInformation = new HashMap<>();
        int i = 0;
        while (i < valuesArr.length){
            studentInformation.put(keysArr[i], valuesArr[i]);
            i++;
        }
                return new HashMap<>(studentInformation);
    }

    public static List<String> select(List<Map<String, String>> list, String... keys) {
        List<String> selectedMap = new ArrayList<>();

        String columns = new String("");
        int i = 0;
        int j = 0;
        while( i < keys.length){
            columns = columns.concat(String.format("%s%s", i == 0 ? "" : "?", keys[i]));
            i++;
        }
        selectedMap.add(columns);
        while(i < list.size()){
            String rows = new String("");
            while (j < keys.length) {
                String values = list.get(i).get(keys[j]);
                if(!list.get(i).containsKey(keys[j])) {
                    values = "NONE";
                }
                rows = rows.concat(String.format("%s%s", j == 0 ? "" : ";", values));
                j++;
            }
            selectedMap.add(rows);
            i++;
        }
        return new ArrayList<>(selectedMap);
    }

    public static void prettify(List<String> strings) {
        int columnLength= 0;
        int i = 0;
        int j = 0;
        while ( i < strings.size()){
            String[] rowNth = strings.get(i).split(";");
            while (j < rowNth.length ){
                if( columnLength < rowNth[j].length()) {
                    columnLength = rowNth[j].length();
                }
                j++;
            }
            i++;
        }
        
        while ( i < strings.size()) {
            String[] rowNth = strings.get(i).split(";");
            String rows = "";
            while ( j < rowNth.length){
                rows = rows.concat(String.format("%s %" + (-columnLength) + "s |",
                j == 0 ? "|" : "",
                i == 0 ? rowNth[j].toUpperCase() : rowNth[j]));
                j++;
            }
           

            System.out.printf("%s\n", rows);

            int rowLength = rows.length();
            if ( i == 0 || i == strings.size() - 1){
                String separator = "-";
                System.out.printf(" %s\n", separator.repeat((rowLength - 2)));
            }
            i++;
        }
    }
}


