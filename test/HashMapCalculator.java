import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int match = 0;
		for(String keys : hashmap1.keySet()) {
			String values = hashmap1.get(keys);
			if (values.equals(hashmap2.get(keys))) {
				match++;
			}
		}
		return match;
	}

}
