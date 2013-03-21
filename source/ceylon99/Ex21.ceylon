
void ex21Method(String? message, Object arg){
    doc "Message cannot be null"
    assert (exists message);
    doc "Unknown arg type: "
    assert (is String|Number arg);
    print("``message``: ``arg``");
}

void ex21(){
    ex21Method("Hello", 2);
    ex21Method("Hello", "you");
    ex21Method("Hello", true);
    ex21Method(null, 1);
}