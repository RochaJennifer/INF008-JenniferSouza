package Lista1.Questao1;

public class AddressBook {

    private Contact[] contacts = new Contact[10];

    public boolean addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                return true;
            }
        }
        return false;
    }

    public Contact findByName(String name) {
    for (int i = 0; i < contacts.length; i++) {
        if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(name)) {
            return contacts[i];
        }
    }
    return null;
}

    public void listContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i].displayInfo());
                System.out.println("-------------------");
            }
        }
    }
}