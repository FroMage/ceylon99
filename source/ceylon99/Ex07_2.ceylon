class Ex7_2(attr){
    shared variable String attr;
    shared String attr2 {
        return attr.uppercased;
    }
    assign attr2 {
        attr = attr2.lowercased;
    }
    
    string = "AJavattr: ``attr``, AJavattr2: ``attr2``";
}

void ex7_2(){
    print(Ex7_2("Hello"));
}