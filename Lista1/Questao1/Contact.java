package Lista1.Questao1;

public class Contact{
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String displayInfo() {
        String emailInfo = (email == null || email.isEmpty()) 
        ? "Email não informado" 
        : email;

        return "Name: " + name +
            "\nPhone: " + phone +
            "\nEmail: " + emailInfo;
    }

    public void updateContact(String phone, String email){
        if(phone != null && !phone.isEmpty()) {
            this.phone = phone;
        }
        if(email != null && !email.isEmpty()){
            this.email = email;
        }
    }

    
}