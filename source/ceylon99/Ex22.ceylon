import ceylon.collection { LinkedList }
import ceylon.language { List }

class Ex22<T>(){
    value store = LinkedList<T>();
    
    shared void addAllYouCan<Other>(List<Other> otherList){
        for(other in otherList){
            if(is T other){
                store.add(other);
            }
        }
    }
    
    string => store.string;
}

void ex22(){
    value numbers = Ex22<Number>();
    List<Object> floatsAndStrings = [1.2, 3.4, "hello"];
    numbers.addAllYouCan(floatsAndStrings);
    print(numbers);
}