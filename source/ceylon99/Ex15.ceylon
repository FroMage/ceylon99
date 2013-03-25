class List<T>(T* elements) {
    shared T? get(Integer i){
        return elements[i];
    }
}

class CovariantList<out T>(T* elements) {
    shared T? get(Integer i){
        return elements[i];
    }
    // covariant (out) type parameter T appears in contravariant location in type: T
    //shared void put(Integer i, T item){}
}

void ex15(){
    List<String> invariantList = List("fu", "bar", "gee");
    // specified expression must be assignable to declared type of listOfObjects: List<String> is not assignable to List<Object>
    //List<Object> listOfObjects = invariantList;

    CovariantList<String> covariantList = CovariantList("fu", "bar", "gee");
    CovariantList<Object> listOfObjects = covariantList;
    Object? o = listOfObjects.get(0);
    print(o);
}