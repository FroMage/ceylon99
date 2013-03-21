
void ex19Method(Object o){
    if(is String o){
        print("Got a string: ``o.uppercased``");
    }else if(is Number o){
        print("Got a number: ``o.negative``");
    }else{
        print("Well, no idea: ``o``");
    }
}

void ex19(){
    ex19Method(1);
    ex19Method("yo");
    ex19Method(true);
}