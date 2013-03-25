void ex05(){
    // {<Integer|Float>+} ints
    {Number&Invertable<Number>+} ints = {1, 2, 3, 4.0};
    for(i in ints){
        // on Number
        print(i.float);
        // on Invertable<Number>
        print(i.negativeValue);
    }
}