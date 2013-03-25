package ceylon99.out;

interface CanIHasCloneJava<T> {
	T gimmeClonez();
}

class AJava implements CanIHasCloneJava<AJava> {
	@Override
	public AJava gimmeClonez() {
		return new AJava();
	}
}

// The interface CanIHasCloneJava cannot be implemented more than once with different arguments: CanIHasCloneJava<AJava> and CanIHasCloneJava<BJava>
class BJava extends AJava /* implements CanIHasCloneJava<BJava> */ {
	@Override
	public BJava gimmeClonez() {
		return new BJava();
	}
}

public class Ex17Java {
	
	public static void main(String[] args) {
		AJava a = new AJava();
		AJava aClone = a.gimmeClonez();
		CanIHasCloneJava<AJava> aCloneable = a;
		aClone = aCloneable.gimmeClonez();
		
		BJava b = new BJava();
		BJava bClone = b.gimmeClonez();
		// Type mismatch: cannot convert from BJava to CanIHasCloneJava<BJava>
//		CanIHasCloneJava<BJava> bCloneable = b;

		// this works
		CanIHasCloneJava<? extends AJava> bCloneable = b;
		// well, almost: Type mismatch: cannot convert from capture#1-of ? extends AJava to BJava
//		BJava bClone2 = bCloneable.gimmeClonez();

		// this works???
//		CanIHasCloneJava<? super BJava> bCloneable = b;
		// well, almost: Type mismatch: cannot convert from capture#1-of ? super BJava to BJava
//		BJava bClone2 = bCloneable.gimmeClonez();
	}
}
