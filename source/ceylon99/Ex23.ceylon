
void ex23Method(String? message, Object arg){
    doc "Message cannot be null"
    assert (exists message);
    doc "Unknown arg type: "
    assert (is String|Number arg);
    print("``message``: ``arg``");
}

void ex23(){
    ex23Method("Hello", 2);
    ex23Method("Hello", "you");
    ex23Method("Hello", true);
    ex23Method(null, 1);
}