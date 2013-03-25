interface MyIterable<T>{
    shared formal Iterator<T> iterator();
    shared formal Integer size;

    shared actual String string {
        value sb = StringBuilder();
        value it = iterator();
        while(!is Finished item = it.next()){
            if(sb.size > 0){
                sb.append(", ");
            }
            sb.append(item?.string else "null");
        }
        return sb.string;
    }
}

class Ex13List<T>(T* items) satisfies MyIterable<T>{
    iterator() => items.iterator();

    size = items.size;
}

class Ex13Range(Integer start, Integer count) satisfies MyIterable<Integer>{
    shared actual Iterator<Integer> iterator(){
        object it satisfies Iterator<Integer> {
            variable Integer used = 0;
            shared actual Integer|Finished next() => 
                used >= count then finished else start + used++;
        }
        return it;
    }
    
    size = count;
}

void ex13(){
    print(Ex13List(1, 2, 3));
    print(Ex13Range(10, 4));
}