import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1.Есть два класса: Address с полями улица и номер дома и
        // Person с полями  name and address.  нужно написать
        // метод List<Address> getAddress(List<Person> persons).
        // то есть по списку persons вернуть список их адресов

        List<Person> people = Arrays.asList(new Person("Eva", new Address("Solo", 12)),
                new Person("Ivan", new Address("Green", 4)),
                new Person("Vlad", new Address("Blu", 18)),
                new Person("Olga", new Address("First", 23)),
                new Person("Vick", new Address("Virto", 14))
        );
        System.out.println(Arrays.toString(new List[]{people}));
        System.out.println(Arrays.toString(new List[]{getAddress(people)}));
        System.out.println(Arrays.toString(new List[]{getAddress1(people)}));

        //2. есть список с именами Ivan,Maria, Stephan, John,Amalia.
        // Написать метод, который вернет список не содержащий
        // имена исходного списка длиной 4
        //Ivan,Maria, Stephan, John,Amalia. -> Maria, Stephan,Amalia.

        List<String> nameList = Arrays.asList("Ivan", "",
                "Maria",
                "Stephan",
                "John", "Amalia");
        System.out.println(Arrays.toString(new List[]{getNameLong4(nameList)}));

        //3. Есть два списка одинаковой длины с целыми числами. Написать метод, который вернет
        // списиок с элементами Yes или No где значение на i-м месте зависит от того равны ли
        // элементы двух списков под номером i
        //{1,2,3,4} ,{5,2,3,8} ->{No,Yes,Yes,No}
        int[] nuber1 = {1, 4, 7, 8};
        int[] nuber2 = {0, 4, 3, 8};
        System.out.println(Arrays.toString(new List[]{getRes(nuber1, nuber2)}));
        //4.Написать метод, реверсирующий список,т.е. возвращающий список элементов в обратном порядке
        // 1,2,3 -> 3,2,1   Можно использовать методы класса Collections

        List<Integer> revers = Arrays.asList(9, 8, 7, 6, 5, 4);
        List<Integer> rever1s = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(Arrays.toString(new List[]{revers(revers)}));
        System.out.println(Arrays.toString(new List[]{revers1(rever1s)}));

//5*.Написать метод, который возвращает строку, встречающуюся раньше в листе: самую
        // короткую или самую длинную. Если несколько строчек самые короткие или самые длинные,
        // тогда вернуть первую встреченную  из них. Лист не пустой
        //"bb","a","ff","ddd" -> "a"
        //"bb","aaa","ff","d" -> "aaa"
        List<String> objekt1 = Arrays.asList("bb", "aaa", "ff", "d");
        List<String> objekt2 = Arrays.asList("bb", "a", "ff", "ddd");
        System.out.println(Arrays.toString(new String[]{str(objekt1, objekt2)}));

    }

    public static List<Address> getAddress(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            addresses.add(i, persons.get(i).getAddress());
        }
        return addresses;
    }

    public static List<Address> getAddress1(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        for (Person p : persons) {
            addresses.add(p.getAddress());
        }
        return addresses;
    }

    public static List<String> getNameLong4(List<String> name) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).length() != 4) {
                newList.add(name.get(i));
            }
        }
        return newList;
    }

    public static List<String> getRes(int[] n1, int[] n2) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == n2[i]) {
                newList.add(i, "Yes");
            } else {
                newList.add(i, "No");
            }
        }
        return newList;
    }

    public static List<Integer> revers(List<Integer> o1) {
        List<Integer> res = new ArrayList<>();
        Collections.sort(o1);
        for (int i = 0; i < o1.size(); i++)
            res.add(i, o1.get(i));
        return res;
    }

    public static List<Integer> revers1(List<Integer> o1) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < o1.size(); i++)
            res.add(i, o1.get(o1.size() - i - 1));
        return res;
    }

    public static String str(List<String> strings, List<String> ss) {
        List<Integer> flag = new ArrayList<>();
        strings.sort(new ComparetorString());
        String res = "";
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(0).length() == ss.get(i).length() || strings.get(strings.size() - 1).length() == ss.get(i).length()) {
                res = ss.get(i);
            }
        }
        return res;
    }

}
