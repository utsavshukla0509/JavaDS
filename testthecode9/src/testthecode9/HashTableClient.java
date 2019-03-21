package testthecode9;

public class HashTableClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(4);
		map.put("USA", 200);
		map.put("India", 300);
		//map.display();

		map.put("UK", 175);
		map.display();
		map.put("Aus", 150);
		map.put("Russia", 340);
//		map.put("Syria", 20);
		//map.put("India", 325);
		map.display();

//		System.out.println(map.get("India"));
//		System.out.println(map.get("Ireland"));
//
//		System.out.println(map.remove("Aus"));
//		map.display();

	}

}
