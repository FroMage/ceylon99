package ceylon99;

class EntryJava<Key,Item>{
	final Key key;
	final Item item;
	EntryJava(Key key, Item item) {
		this.key = key;
		this.item = item;
	}
}

class Ex14MapJava<Key,Item> {
	
	final EntryJava<Key,Item>[] entries;
	
	@SafeVarargs
	Ex14MapJava(EntryJava<Key,Item>... entries){
		this.entries = entries;
	}
	
	Item get(Key key){
		for(EntryJava<Key,Item> entry : entries){
			if(entry.key.equals(key)){
				return entry.item;
			}
		}
		return null;
	}
}

public class Ex14Java {
	
	public static void main(String[] args) {
		Ex14MapJava<Number, String> map = new Ex14MapJava<Number, String>(new EntryJava<Number,String>(1, "fu"), new EntryJava<Number,String>(1, "bar"));
		// Type mismatch: cannot convert from Ex14MapJava<Number,String> to Ex14MapJava<Integer,Object>
//		Ex14MapJava<Integer, Object> moreGenericMap = map;
		Ex14MapJava<? super Integer, ? extends Object> moreGenericMap = map;
		Object object = moreGenericMap.get(1);		
		System.out.println(object);
	}
}
