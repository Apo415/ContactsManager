//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Aminata";
        c1.phoneNumber = "0701020304";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Kofi";
        c2.phoneNumber = "0705060708";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Fatou";
        c3.phoneNumber = "0709101112";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Moussa";
        c4.phoneNumber = "0713141516";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Awa";
        c5.phoneNumber = "0717181920";
        myContactsManager.addContact(c5);

        Contact found = myContactsManager.searchContact("Awa");

        if (found != null) {
            System.out.println("Contact trouvé : " + found.name);
            System.out.println("Téléphone : " + found.phoneNumber);
        } else {
            System.out.println("Contact introuvable.");
        }
    }
}