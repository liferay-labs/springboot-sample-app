package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductRepository {

	private static final Map<String, Product> productsMap = createMap();

	private static Map<String, Product> createMap() {

		Map<String, Product> productsMap = new HashMap<>();

		productsMap.put("productA", new Product("productA", 0.99, "EUR"));
		productsMap.put("productB", new Product("productB", 1.99, "EUR"));

		return productsMap;
	}

	public static Product getProductByName(String name) {
		return productsMap.get(name);
	}

	public static Set<String> getProductNames() {
		return productsMap.keySet();
	}

}
