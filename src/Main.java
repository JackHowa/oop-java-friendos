public class Main {
  public static void main(String [] args) {
    // Create the ContactsManager object
    ContactsManager contactsManager = new ContactsManager();

    // create Contact object called wife
    Contact wife = new Contact();

    // set the object's fields
    wife.name = "Noname";
    wife.phoneNumber = "1800202luna";

    // add the Contact object to the field myFriends via addContact method
    contactsManager.addContact(wife);

    Contact dad = new Contact();
    dad.name = "Noone";
    dad.phoneNumber = "8008335555";

    contactsManager.addContact(dad);

    Contact targetFriend = contactsManager.searchContact("Noname");

    System.out.println(targetFriend.phoneNumber);
  }
}
