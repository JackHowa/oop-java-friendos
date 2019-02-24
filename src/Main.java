public class Main {
  public static void main(String [] args) {
    System.out.println("Yo world");
    ContactsManager contactsManager = new ContactsManager();
    System.out.println("Friendos count");
    System.out.println(contactsManager.myFriends.length);
  }
}
