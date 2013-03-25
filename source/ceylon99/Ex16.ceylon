import ceylon.collection { HashMap }

void ex16(){
    Correspondence<Number, String> map = HashMap<Number,String>{1 -> "fu", 2 -> "bar"};
    
    Correspondence<Integer, Object> moreGenericMap = map;
    value o = moreGenericMap.get(1);
    print(o);
}