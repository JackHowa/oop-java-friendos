/**
 * @author jackhowa
 */
public class Main {
  public static void main(String [] args) {
    // Create the ContactsManager object
    ContactsManager contactsManager = new ContactsManager();

    // create Contact object called wife
    Contact wife = new Contact(
        "Noname",
        "1800202luna"
    );

    // add the Contact object to the field myFriends via addContact method
    contactsManager.addContact(wife);

    Contact dad = new Contact(
        "Noone",
        "8008335555"
    );

    contactsManager.addContact(dad);

    Contact targetFriend = contactsManager.searchContact("Noname");

    System.out.println(targetFriend.getPhoneNumber());
  }
}
