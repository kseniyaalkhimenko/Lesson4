import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 task");

        List<String> list = Arrays.asList(
                "summer", "autumn", "winter", "spring",
                "summer", "autumn", "winter", "spring",
                "summer", "autumn", "winter", "spring",
                "summer", "autumn", "winter", "spring",
                "ocean", "sea", "river", "lake");
        Set<String> unique = new HashSet<>(list);

        System.out.println("List:" + list);
        System.out.println("Unique words:" + unique);
        System.out.println("Amount of every unique word in the list:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(list, key));
        }

        System.out.println();
        System.out.println("2 task");
        Phonebook phonebook = new Phonebook();

        phonebook.add("Smith", "80293335544");
        phonebook.add("Brown", "80291112233");
        phonebook.add("Johnson", "80297776545");
        phonebook.add("Johnson", "80296554323");
        phonebook.add("Smith", "80296554323");
        System.out.println();
        System.out.println("Smith " + phonebook.get("Smith"));
        System.out.println("Brown " + phonebook.get("Brown"));
        System.out.println("Johnson " + phonebook.get("Johnson"));
        System.out.println("Williams " + phonebook.get("Williams"));

    }
}