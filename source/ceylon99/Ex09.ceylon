class Ex09(attr){
    shared variable String attr;
    shared String attr2 {
        return attr.uppercased;
    }
    assign attr2 {
        attr = attr2.lowercased;
    }
    
    string = "AJavattr: ``attr``, AJavattr2: ``attr2``";
}

void ex09(){
    print(Ex09("Hello"));
}