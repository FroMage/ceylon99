class Ex10(Integer width = 2,
           Integer height = width * 2){
    
    string = "``width`` * ``height``";
}

void ex10(){
    print(Ex10());
    print(Ex10(10));
    print(Ex10(10, 50));
}