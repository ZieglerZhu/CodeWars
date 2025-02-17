package kyu5.Pete_the_baker;

import java.util.HashMap;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        Map<String, Integer> countMap = new HashMap<>();
        for (Map.Entry<String, Integer> item : recipe.entrySet()) {
            Integer availableItem = available.get(item.getKey());
            int itemCount = (availableItem == null) ? 0 : (availableItem / item.getValue());
            countMap.put(item.getKey(), itemCount);
        }
        return countMap.values().stream().sorted().findFirst().orElse(0);
    }
}
