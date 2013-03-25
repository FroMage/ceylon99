class Ex08(name, age){
    shared variable String name;
    shared variable Integer age;
    
    //shared String shouted {
    //    return name.uppercased;
    //}
    // ou bien
    shared String shouted => name.uppercased;

    assign shouted {
        name = shouted.lowercased;
    }
    
    //shared actual String string = "Name: ``name``, Shouted: ``shouted``, Age: ``age``";
    string = "Name: ``name``, Shouted: ``shouted``, Age: ``age``";
}

void ex08(){
    value items = {Ex08("Stef", #22), Ex08("Emmanuel", $100011)};
    for(item in items){
        print(item);
    }
}