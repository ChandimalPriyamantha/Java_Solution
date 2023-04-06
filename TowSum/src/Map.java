import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Chandimal",12345);
        empIds.put("Tharuka",123234);
        empIds.put("Sadeepa",121235);

        System.out.println(empIds);
        System.out.println(empIds.get("Chandimal"));
        System.out.println(empIds.containsKey("Tharuka"));
        System.out.println(empIds.containsValue(12345));

        empIds.put("Chandimal", 8765543);
        System.out.println(empIds);

        empIds.putIfAbsent("Chandimal",2334);
        System.out.println(empIds);

        empIds.putIfAbsent("Kamal",2334);
        System.out.println(empIds);

        empIds.remove("Chandimal");
        System.out.println(empIds);
    }

}
