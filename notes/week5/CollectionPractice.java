import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionPractice {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Kobe");
    list.add("Berlin");
    list.add("sakee");
    list.add("pairs");
    list.add("test");
    System.out.println(list);

    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4); 
    set.add(5);
    set.add(6);
    set.add(7);
    set.add(6);
    set.add(7);
    set.add(5);
   
    Map<String, Integer> map = new HashMap<>();
    map.put("liqiang", 10);
    map.put("zhangfei", 6);
    map.put("liubei", 8);
    System.out.println(map);
  }
}
