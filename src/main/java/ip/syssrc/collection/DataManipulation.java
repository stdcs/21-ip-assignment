package ip.syssrc.collection;

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

    public static List<String> select(/* signatures */) {
        return new ArrayList<>();
    }

    public static void prettify(List<String> strings) {}

}
