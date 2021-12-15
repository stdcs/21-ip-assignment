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
 * @author H071211064- Agung Kartika Ardhiyanda <agungardhiyanda25@gmail.com>
 *
 */
public class DataManipulation {

    public static void main(String[] args) {
        
        //List<Map<String, String>> student = new ArrayList<>();
        
      
        // student.add(insert("id, first_name, last_name, gender", "H071171512, Fitrah, Muhammad, Male"));
        // student.add(insert("id, first_name, last_name, gender", "H071171510, Amalia, Dwi, Female"));
        // student.add(insert("id,first_name,last_name,gender", "H071171504, Rabia,Adaw,Female"));
        // student.add(insert("id,first_name, last_name, gender", "H071171308,Babang,Arizk,Male"));
        
        
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
                return studentInformation;
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
        return selectedMap;
    }

    public static void prettify(List<String> strings) {
       int columnLength = 0;
       int i = 0;
       int j = 0;
       while (i < strings.size()){
           String[] rowNth = strings.get(i).split(";");
           while (j < rowNth.length){
               if(columnLength < rowNth[j].length()){
                   columnLength = rowNth[j].length();
               }
               j++;
           }
           i++;
        }

        String formatter = " | %" + (-columnLength) + "s ";
        String separator = "-";

        strings.set(0, strings.get(0).toUpperCase());
        String[] columnName = strings.get(0).split(";");
        String firstRows = "";

        int a = 0;
        while (a < columnName.length) {
            firstRows = firstRows.concat(String.format(formatter, columnName[a]));
        }

        int rowLength = firstRows.length() - 1;
        System.out.printf("%s", firstRows);

        System.out.printf(" %s\n", separator.repeat(rowLength));

        int k = 1;
        int l = 0;
        while ( k < strings.size()){
            String[] rowNth = strings.get(k).split(";");
            String rows = "";
            while ( l < rowNth.length){
                rows = rows.concat(String.format(formatter, rowNth[l]));
                l++;
            }
            k++;
        }
        System.out.printf("%s", rows);
        System.out.println("|");
    }

    System.out.printf(" %s\n", separator.repeat(rowLength));
    }

}


