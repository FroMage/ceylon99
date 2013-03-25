class Ex24(){
    shared class Inner(){
        shared void m(){
            this.f();
            outer.f();
        }
        void f(){
            print("Inner");
        }
    }
    void f(){
        print("Ex24");
    }
}

void ex24(){
    Ex24().Inner().m();
}