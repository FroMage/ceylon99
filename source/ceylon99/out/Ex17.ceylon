
interface CanIHasClone<out T> {
    shared formal T gimmeClonez();
}

class A() satisfies CanIHasClone<A> {
    shared actual default A gimmeClonez() {
        return A();
    }
}

class B() extends A() satisfies CanIHasClone<B> {
    shared actual default B gimmeClonez() {
        return B();
    }
}

void ex17(){
    A a = A();
    A aClone = a.gimmeClonez();
    CanIHasClone<A> aCloneable = a;
    A aClone2 = aCloneable.gimmeClonez();
    
    B b = B();
    B bClone = b.gimmeClonez();
    CanIHasClone<B> bCloneable = b;
    B bClone2 = bCloneable.gimmeClonez();
}