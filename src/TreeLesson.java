import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeLesson {
	public static void main(String[] args) {
		Map<String, String> hm = new TreeMap<>();
		hm.put("Moscow", "Russia");
		String country = hm.get("Moscow");
		if (country != null) {
			System.out.println(country);
		}
		for (String c : hm.values()) {
			System.out.println(c);
		}
	}
}
