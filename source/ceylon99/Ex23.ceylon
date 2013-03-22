class Ex23(shared String name, shared Integer age){
    shared actual Boolean equals(Object that) {
        if(is Identifiable that, that === this){
            return true;
        }
        if(is Ex23 that){
            return name == that.name && age == that.age;
        }
        return false;
    }
}

void ex23(){
    Ex23 stef = Ex23("stef", #22);
    Ex23 stef2 = Ex23("stef", #22);
    print(stef == stef2);
    print(stef.equals(stef2));
    print(stef === stef2);
}