package ceylon99;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

interface MyIterableJava<T> {
	Iterator<T> iterator();
	int getSize();
}

class Ex11ListJava<T> implements MyIterableJava<T> {

	private List<T> elems;

	public Ex11ListJava(T... elems) {
		this.elems = Arrays.asList(elems);
	}
	
	@Override
	public Iterator<T> iterator() {
		return elems.iterator();
	}

	@Override
	public int getSize() {
		return elems.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Iterator<T> it = iterator();it.hasNext();){
			if(sb.length() > 0){
				sb.append(", ");
			}
			sb.append(it.next());
		}
		return sb.toString();
	}
}

class Ex11RangeJava implements MyIterableJava<Integer> {

	private int start;
	private int count;

	public Ex11RangeJava(int start, int count) {
		this.start = start;
		this.count = count;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			int used = 0;
			@Override
			public boolean hasNext() {
				return used < count;
			}
			@Override
			public Integer next() {
				return start + used++;
			}
			@Override
			public void remove() {}
		};
	}

	@Override
	public int getSize() {
		return count;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Iterator<Integer> it = iterator();it.hasNext();){
			if(sb.length() > 0){
				sb.append(", ");
			}
			sb.append(it.next());
		}
		return sb.toString();
	}
}

public class Ex11Java {
	
	public static void main(String[] args) {
		MyIterableJava<Integer> iterable1 = new Ex11ListJava<>(1, 2, 3);
		System.out.println(iterable1);

		MyIterableJava<Integer> iterable2 = new Ex11RangeJava(10, 4);
		System.out.println(iterable2);
	}
}
