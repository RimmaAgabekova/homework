package hm5;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class PhoneBook {
   private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

   public void addPhone(String name, String phone) {
       ArrayList<String> phones = phoneBook.get(name);
       phones.add(phone);

   }
   public void fill(){
       phoneBook.put("Sidorov", new ArrayList<>());
       phoneBook.put("Ivanov", new ArrayList<>());
       phoneBook.put("Petrov", new ArrayList<>());
       phoneBook.put("Novikov", new ArrayList<>());

       addPhone("Ivanov", "566-854");
       addPhone("Ivanov", "583-613");
       addPhone("Ivanov", "891756844668");
       addPhone("Petrov", "253-524");
       addPhone("Petrov", "89875641236");
       addPhone("Sidorov", "89632145577");
       addPhone("Novikov", "+79531237485");
       addPhone("Novikov", "859-632");
   }
   public void sort(){
       phoneBook = phoneBook
               .entrySet()
               .stream()
               .sorted(new MyComparator())
               .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (k, v) -> {
                                    throw new RuntimeException();
                                }, LinkedHashMap:: new ));

//       List<String> phones = new ArrayList<>();
//       for (Map.Entry<String, ArrayList<String>> entry: phoneBook.entrySet()){
//           phones.addAll(entry.getValue());
//       }
//       Comparator phoneComparator = new MyComparator();
//        выдает такую ошибку, надо разобраться - finished with non-zero exit value 1

   }
    public Map<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }
    @Override
    public String toString() {
        return "PhoneBook{" + phoneBook + '}';
    }
}

