class Ex11(String firstName = "Fredrik",
           String lastName = firstName + "sen",
           Integer age = 20,
           String title = "M"){
    
    string = "``title`` ``firstName`` ``lastName`` (``age``)";
}

void ex11(){
    print(Ex11());
    print(Ex11("Stef", "Epardaud", #22, "Dr"));
    print(Ex11{ firstName = "Emmanuel"; lastName = "Bernard"; age = #23; title = "M"; });
    print(Ex11{ title = "M"; firstName = "Emmanuel"; lastName = "Bernard"; age = #23; });
    print(Ex11{ title = "Mlle"; });
}