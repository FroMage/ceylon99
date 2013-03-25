class Ex19() {

    Integer callMe(Integer i = 2){
        return i;
    }
    
    shared void method(){
        workWithMeNoArg(callMe);
        workWithMeOneArg(callMe, 3);
        Integer(Integer=) callable = callMe;
        callable();
        callable(1111);
        
        Integer itsDangerousToGoAloneTakeThis = 3;
        variable Integer count = 0;
        variable Integer otherResult = 0;
        workWithMeNoArg(void () {
            count++;
            otherResult += itsDangerousToGoAloneTakeThis;
        });
        print("count: ``count``, otherResult: ``otherResult``");

        workWithMeNoArg(Ex19);
    }
    
    void workWithMeNoArg<Ret>(Ret callable()) {
        print(callable());
    }

    void workWithMeOneArg<Ret,Arg>(Ret callable(Arg arg), Arg a) {
        print(callable(a));
    }
    
    string => "Ex19, man";
}

void ex19(){
    Ex19().method();
}