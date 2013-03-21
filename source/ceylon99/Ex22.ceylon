class Ex22(){
    shared class Inner(){
        shared void m(){
            f();
            outer.f();
        }
        void f(){
            print("Inner");
        }
    }
    void f(){
        print("Ex22");
    }
}

void ex22(){
    Ex22().Inner().m();
}