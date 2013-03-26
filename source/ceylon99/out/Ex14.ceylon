interface Top {
    shared default void f(){
        print("Top");
    }
}

interface Left satisfies Top {
    shared actual default void f() {
        print("Left");
    }
}

interface Right satisfies Top {
    shared actual default void f() {
        Top::f();
        print("Right");
    }
}

// member f is inherited ambiguously from Left and Top and so must be refined by Bottom
class Bottom() satisfies Left & Right{
    shared actual void f(){
        Left::f();
        Right::f();
    }
}

void ex14(){
    Bottom().f();
}