package colecciones;

import java.util.LinkedHashMap;


public class LinkedHashMapEjemplo {
    public static void main(String[] args) {
    	LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Java", 1);
        linkedHashMap.put("Java", 2);
        linkedHashMap.put("JavaScript", 3);

        System.out.println("LinkedHashMap: " + linkedHashMap);

        int value = linkedHashMap.get("Java");
        System.out.println("Valor asociado a la clave 'Java': " + value);
    }
}
