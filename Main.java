import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String l = "Use this free online newspaper generator to create your, own spoof newspaper articles. Just upload a photo and add your own text. Enter newspaper title and" ;
                String[] array=l.split("[[ ]*|[,]*|[\\\\.]*|[/]*|[!]*|[?]*|[+]*]+");
                for(int i =0;i<array.length;i++)
                    System.out.println(array[i]+"\n");
                Map<String, Integer> nameAndCount = new HashMap<>(); // build hash table with count
        for (String name : array)
        { Integer count = nameAndCount.get(name);
        if (count == null)
        { nameAndCount.put(name, 1); }
        else { nameAndCount.put(name, ++count); }
        }

         LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        nameAndCount.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Sorted Map   : " + sortedMap);
       // return false;
    }
}
