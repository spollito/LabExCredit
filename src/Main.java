// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);


            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }


            map.get(sorted).add(s);
        }


        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Main sorter = new Main();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "race", "care", "heart", "earth"};
        List<List<String>> groupedAnagrams = sorter.groupAnagrams(strs);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}