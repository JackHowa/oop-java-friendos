/**
 * @author jackhowa
 */
class ContactsManager {
  private Contact [] myFriends;
  private int friendsCount;

  /**
   * Create contact manager object with default 500 contacts available
   * Start with zero friends created
   */
  ContactsManager() {
    friendsCount = 0;
    myFriends = new Contact[500];
  }

  void addContact(Contact contact) {
    myFriends[friendsCount] = contact;

    // fiends count remains private and used for adding to contacts
    friendsCount++;
  }

  Contact searchContact(String searchName) {
    for (int i = 0; i < friendsCount; i++) {
      if (myFriends[i].getName().equals(searchName)) {
        return myFriends[i];
      }
    }
    return null;
  }
}
