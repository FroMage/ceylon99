
void ex21Method(Object o){
    if(is String o){
        print("Got a string: ``o.uppercased``");
    }else if(is Number o){
        print("Got a number: ``o.negative``");
    }else{
        print("Well, no idea: ``o``");
    }
}

void ex21(){
    ex21Method(1);
    ex21Method("yo");
    ex21Method(true);
}