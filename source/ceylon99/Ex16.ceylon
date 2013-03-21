import java.lang { Thread { currentThread }}

void ex16(){
    print("A");
    currentThread().sleep(2000);
    print("B");
}