package ceylon99;

class EntryJava<Key,Item>{
	final Key key;
	final Item item;
	EntryJava(Key key, Item item) {
		this.key = key;
		this.item = item;
	}
}

class Ex16MapJava<Key,Item> {
	
	final EntryJava<Key,Item>[] entries;
	
	@SafeVarargs
	Ex16MapJava(EntryJava<Key,Item>... entries){
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

public class Ex16Java {
	
	public static void main(String[] args) {
		Ex16MapJava<Number, String> map = new Ex16MapJava<Number, String>(new EntryJava<Number,String>(1, "fu"), new EntryJava<Number,String>(2, "bar"));
		// Type mismatch: cannot convert from Ex16MapJava<Number,String> to Ex16MapJava<Integer,Object>
//		Ex16MapJava<Integer, Object> moreGenericMap = map;
		Ex16MapJava<? super Integer, ? extends Object> moreGenericMap = map;
		Object object = moreGenericMap.get(1);		
		System.out.println(object);
	}
}
