
import java.util.TreeMap;

public class TreeMapCollection
{
    public static void main(String[] args) {
        TreeMap treeMap= new TreeMap();
        treeMap.put("A", "C");
        treeMap.put("D", "A");
        treeMap.put("B","D");
        treeMap.put("C","B");

        System.out.print(treeMap);
    }
}
