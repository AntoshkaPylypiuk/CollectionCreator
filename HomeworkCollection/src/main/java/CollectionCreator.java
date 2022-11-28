import java.util.*;

import static javax.swing.UIManager.put;

public class CollectionCreator {

    public static void main(String[] args) {
        String[] masivPrizvich = {"Антонов", "Шевченко", "Бойко", "Шевченко", "Кравченко", "Савицький", "Антонов", "Шевченко", "Тетерів", "Мамченко"};
        List<String> listSurnames = new ArrayList<>();
        for (String secondName : masivPrizvich) {
            listSurnames.add(secondName);
        }
        int size = listSurnames.size();
        System.out.println("Кількість прізвищ : " + listSurnames.size());

        Set<String> uniqueSurnames = new HashSet<>();
        for (String currentName : masivPrizvich) {
            uniqueSurnames.add(currentName);
        }
        System.out.println(uniqueSurnames);

        int size2 = uniqueSurnames.size();
        System.out.println("Кількість унікальних прізвищ : " + uniqueSurnames.size());

        Map<String, Integer> kilkistBukvPrizviche = new HashMap<>();
        String[] prizviche = {"Антонов"};
        for (String student : prizviche) {
            listSurnames.add(student);
            put(student, student.length());
            System.out.println("Кількість букв в прізвищі : " + student.length());
        }
    }
}