class Ex12(Integer width = 2,
           Integer height = width * 2){
    
    string = "``width`` * ``height``";
}

void ex12(){
    print(Ex12());
    print(Ex12(10));
    print(Ex12(10, 50));
}