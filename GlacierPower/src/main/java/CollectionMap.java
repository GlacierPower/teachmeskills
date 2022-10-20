import java.util.HashMap;
import java.util.HashSet;

public class CollectionMap {
    public static void main(String[] args) {
        HashMap hashMap= new HashMap();
        hashMap.put("Planet", "Saturn");
        hashMap.put("Earth", "Country");
        hashMap.put("Animal","Cat");
        hashMap.put("Earth","Ocean");

        hashMap.remove("Animal");
        System.out.println(hashMap.containsValue("Saturn"));
        System.out.println(hashMap.values());
        System.out.print(hashMap.keySet());
    }
}
