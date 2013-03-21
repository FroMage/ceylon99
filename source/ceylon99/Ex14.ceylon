class Map<Key,Item>(Entry<Key,Item>* elements) 
    given Key satisfies Object
    given Item satisfies Object {
    
    shared Item? get(Key key){
        for(entry in elements){
            if(entry.key == key){
                return entry.item;
            }
        }
        return null;
    }
}

class VariantMap<in Key,out Item>(Entry<Key,Item>* elements) 
    given Key satisfies Object
    given Item satisfies Object {
    
    shared Item? get(Key key){
        for(entry in elements){
            if(entry.key == key){
                return entry.item;
            }
        }
        return null;
    }
}

void ex14(){
    Map<Number, String> invariantMap = Map<Number,String>(1 -> "fu", 2 -> "bar");
    // specified expression must be assignable to declared type of moreGenericMap: Map<Number,String> is not assignable to Map<Integer,Object>
    //Map<Integer, Object> moreGenericMap = invariantMap;

    VariantMap<Number, String> variantMap = VariantMap<Number,String>(1 -> "fu", 2 -> "bar");
    VariantMap<Integer, Object> moreGenericMap = variantMap;
    Object? o = moreGenericMap.get(1);
    print(o);
}