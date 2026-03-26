package Lista1.Questao1;

public class Main {
    public static void main(String[] args) {

        AddressBook agenda = new AddressBook();

        Contact c1 = new Contact("Maria", "1111-1111", "maria@email.com");
        Contact c2 = new Contact("João", "2222-2222");
        Contact c3 = new Contact("Ana", "3333-3333", "ana@email.com");

        System.out.println("Adicionando contatos...");
        System.out.println(agenda.addContact(c1));
        System.out.println(agenda.addContact(c2));
        System.out.println(agenda.addContact(c3));

        System.out.println("\nLista de contatos:");
        agenda.listContacts();

        System.out.println("\nBuscando contato 'joão' (case insensitive):");
        Contact encontrado = agenda.findByName("joão");

        if (encontrado != null) {
            System.out.println("Contato encontrado:");
            System.out.println(encontrado.displayInfo());
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nAtualizando contato João...");
        if (encontrado != null) {
            encontrado.updateContact("9999-9999", "joao@email.com");
        }
        
        System.out.println("\nLista após atualização:");
        agenda.listContacts();
    }
}