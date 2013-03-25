class Ex25(shared String name, shared Integer age){
    shared actual Boolean equals(Object that) {
        if(is Ex25 that){
            return name == that.name && age == that.age;
        }
        return false;
    }
}

void ex25(){
    Ex25 stef = Ex25("stef", #22);
    Ex25 stef2 = Ex25("stef", #22);
    print(stef == stef2);
    print(stef.equals(stef2));
    print(stef === stef2);
}