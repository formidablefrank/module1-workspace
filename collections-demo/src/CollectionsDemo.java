import java.util.*;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		List<String> chipmunks = new ArrayList<>();
		chipmunks = Arrays.asList(new String[] {"Alvin", "Simon", "Theodore"});
		
		List<String> stooges = new ArrayList<>();
		stooges = Arrays.asList(new String[] {"Moe", "Larry", "Curly"});
		
		Map<String, List<String>> map = new HashMap<>();
		map.put("chipmunks", chipmunks);
		map.put("stooges", stooges);
		
		System.out.println(map.get("stooges"));
	}

}
