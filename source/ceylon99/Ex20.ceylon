import ceylon.collection { LinkedList }
import ceylon.language { List }

class Ex20<T>(){
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

void ex20(){
    value numbers = Ex20<Number>();
    List<Object> floatsAndStrings = [1.2, 3.4, "hello"];
    numbers.addAllYouCan(floatsAndStrings);
    print(numbers);
}