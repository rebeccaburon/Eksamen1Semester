package Flere_konstruktører;

public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User (String name, String password){
        this.name=name;
        this.password=password;


    }
    public User (String name, String password, String email){
        this.name=name;
        this.password=password;
        this.email=email;
    }

    public User (String name, String password, String email, int phoneNumber){
        this.name=name;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public  String getPassword(){
        return password;
    }
    public void setPassword(String password){
    this.password=password;

    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
    this.email=email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }


    public void setPhoneNumber(int phoneNumber){
    this.phoneNumber=phoneNumber;
    }


    public String toString() {


        StringBuilder result = new StringBuilder("\nUser:");
        if (name != null) {
            //tilføjer tekst
            result.append("\nName: ").append(name);
        }
        if (password != null) {
            result.append("\nPassword: ").append(password);
        }
        if (email != null) {
            result.append("\nEmail:").append(email);
        }
        if (phoneNumber != 0) {
            result.append("\nPhoneNumber:").append(phoneNumber);
        }
        result.append('.');
        return result.toString();
    }
}
