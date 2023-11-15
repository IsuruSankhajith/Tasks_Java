public class MyFriends {
  public static void main(String args[]) {

    AllMyfriends contacts = new AllMyfriends();

    contacts.add("John","Smith","johnsmith@ecu.edu.au");
    contacts.add("Felix","Finley","felixf@uwa.edu.au");
    contacts.add("Mike","Spelling","mikespe@uow.edu.au");
    contacts.add("Kathy","Ellis","kateellis@usydney.edu.au");
    contacts.add("Debbie","Brown","Dbrowny@umelb.edu.au");

    System.out.println(contacts.toString());
      }
}
