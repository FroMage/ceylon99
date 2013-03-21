class Ex7(name, age){
    shared variable String name;
    shared variable Integer age;
    
    //shared actual String string = "Name: ``name``, AJavage: ``age``";
    string = "Name: ``name``, AJavage: ``age``";
}

void ex7(){
    value items = {Ex7("Stef", #22), Ex7("Emmanuel", $100011)};
    for(item in items){
        print(item);
    }
}