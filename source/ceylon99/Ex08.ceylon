class Ex08(name, age){
    shared variable String name;
    shared variable Integer age;
    
    //shared actual String string = "Name: ``name``, Age: ``age``";
    string = "Name: ``name``, Age: ``age``";
}

void ex08(){
    value items = {Ex08("Stef", #22), Ex08("Emmanuel", $100011)};
    for(item in items){
        print(item);
    }
}