import java.lang { Thread { currentThread }}

void ex18(){
    print("A");
    currentThread().sleep(2000);
    print("B");
}