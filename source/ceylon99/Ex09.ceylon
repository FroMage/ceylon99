class Ex9(String firstName = "Gerard",
          String lastName = "Dupond",
          Integer age = 20,
          String title = "M"){
    
    string = "``title`` ``firstName`` ``lastName`` (``age``)";
}

void ex9(){
    print(Ex9());
    print(Ex9("Stef", "Epardaud", #22, "Dr"));
    print(Ex9{ firstName = "Emmanuel"; lastName = "Bernard"; age = #23; title = "M"; });
    print(Ex9{ title = "M"; firstName = "Emmanuel"; lastName = "Bernard"; age = #23; });
    print(Ex9{ title = "Mlle"; });
}