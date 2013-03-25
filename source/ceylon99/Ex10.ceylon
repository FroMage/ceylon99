//String log(Ex10 instance, String name){
//    print(name);
//    return name;
//}
String log(String name){
    print(name);
    return name;
}

class Ex10(){
    //String log(String name){
    //    print(name);
    //    // forward reference to class member in initializer: age is not yet declared (forward references must occur in declaration section)
    //    print(" age is: ``age``");
    //    return name;
    //}

    // forward reference to class member in initializer: log is not yet declared (forward references must occur in declaration section)
    log("anonymous init");

    // leaks this reference in initializer: Ex10
    //log(this, "anonymous init");
    
    String first = log("field init 1");
    Integer age;
    
    log("init 1");
    age = 2;
    
    String log2(String name){
        print(name);
        print(" age is: ``age``");
        return name;
    }
    
    log2("init 2");
    
    log2("anonymous init 2");
    
    String second = log2("field init 2");

    //String log(String name){
    //    print(name);
    //    print(" age is: ``age``");
    //    return name;
    //}
}
