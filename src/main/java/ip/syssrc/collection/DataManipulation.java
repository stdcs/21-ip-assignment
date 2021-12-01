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
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
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
        return new HashMap<>();
    }

    public static List<String> select(/* signatures */) {
        return new ArrayList<>();
    }

    public static void prettify(List<String> strings) {}

}
