void ex4(){
    // {<Integer|Float>+} ints
    {Number&Invertable<Number>+} ints = {1,2,3,3.0};
    for(i in ints){
        // on Number
        print(i.float);
        // on Invertable<Other>
        print(i.negativeValue);
    }
}