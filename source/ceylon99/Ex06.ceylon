void ex6(){
    value ints = {1,2,3};
    // not efficient
    //value more = ints*.plus(1)*.times(2);
    value more = {for (i in ints) (i + 1) * 2};
    for(i in more){
        print(i);
    }
    // or...
    value more2 = ints.map((Integer i) => (i + 1) * 2);
    for(i in more2){
        print(i);
    }
}