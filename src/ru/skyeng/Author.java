package ru.skyeng;

public class Author {
    private static int ID;
    private final String firstName;
    private final String lastName;
    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getAuthorFullName(){
        return this.firstName + " "+ this.lastName;
    }
}
