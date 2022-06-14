import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private final HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            List<String> numbers = phonebook.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.printf("Phone number %s added for surname %s%n", number, surname);
            }
        } else {
            phonebook.put(surname, new ArrayList<>(List.of(number)));
            System.out.printf("Phone number %s added for surname %s%n", number, surname);
        }
    }

    public List<String> get(String surname) {
        if (phonebook.containsKey(surname)) {
            return phonebook.get(surname);
        } else {
            System.out.printf("There is no contact in the phonebook with surname %s%n", surname);
            return new ArrayList<>();
        }
    }

}
