String neverNull(){
    return "hello";
}

//String sometimesNull(){
//    if(process.nanoseconds % 2 == 0){
//        // returned expression must be assignable to return type of sometimesNull: null is not assignable to String
//        return null;
//    }
//    return "bonjour";
//}

String? sometimesNull(){
    if(process.nanoseconds % 2 == 0){
        return null;
    }
    return "bonjour";
}

void ex20(){
    for(i in 0:20){
        print(neverNull().uppercased);
        // member method or attribute does not exist: uppercased in type String?
        //print(sometimesNull().uppercased);
        print(sometimesNull()?.uppercased);
        if(exists str = sometimesNull()){
            print(str.uppercased);
        }
    }
}