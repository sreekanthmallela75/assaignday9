package assaignmentsday9;
import java.util.Scanner;
public class AddressBook {
    String firstName, lastName, address, city, state, email;
    int zip;
    long phoneNo;
    // array to store object of type AddressBook
    AddressBook[] contactArr = new AddressBook[2];

    Scanner sc = new Scanner(System.in);
    for (int i1 = 0; i < contactArr.length; i++) {

        // create new object in each iteration
        AddressBook contact = new AddressBook();

        System.out.print("\nEnter First Name  : ");
        firstName = sc.nextLine();
        contact.setFirstName(firstName);

        System.out.print("\nEnter Last Name  : ");
        lastName = sc.nextLine();
        contact.setLastName(lastName);

        System.out.print("\nEnter E-mail  : ");
        email = sc.nextLine();
        contact.setEmail(email);

        System.out.print("\nEnter Address  : ");
        address = sc.nextLine();
        contact.setAddress(address);

        System.out.print("\nEnter City  : ");
        city = sc.nextLine();
        contact.setCity(city);

        System.out.print("\nEnter State  : ");
        state = sc.nextLine();
        contact.setState(state);

        System.out.print("\nEnter Phone Number  : ");
        phoneNo = sc.nextLong();
        contact.setPhoneNo(phoneNo);

        System.out.print("\nEnter Zip  : ");
        zip = sc.nextInt();
        contact.setZip(zip);

        sc.nextLine();

        contactArr[i1] = contact;
    }
    System.out.print("\nDo you want to edit? press Y / N : ");
    char editOption = sc.next().charAt(0);
    AddressBook person = new AddressBook();
    if (editOption == 'Y') {
        person.editContact(contactArr);
    }
    for (int i11 = 0; i < contactArr.length; i++) {

        contactArr[i1].showContact(contactArr[i1]);
    }
    sc.nextLine();
    System.out.print("\nDo you want to delete? press Y / N : ");
    char deleteOption = sc.next().charAt(0);
    if (deleteOption == 'Y') {
        person.editContact(contactArr);
    }

    for (int i = 0; i < contactArr.length; i++) {

        contactArr[i1].showContact(contactArr[i1]);
    }

	private void showContact(AddressBook addressBook) {
		// TODO Auto-generated method stub
		
	}

	private void editContact(AddressBook[] contactArr2) {
		
	}

	private void setZip(int zip2) {
		// TODO Auto-generated method stub
		
	}

	private void setPhoneNo(long phoneNo2) {
		// TODO Auto-generated method stub
		
	}

	private void setState(String state2) {
		// TODO Auto-generated method stub
		
	}

	private void setCity(String city2) {
		// TODO Auto-generated method stub
		
	}

	private void setAddress(String address2) {
		// TODO Auto-generated method stub
		
	}

	private void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		
	}

	private void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}
      System.out.println("Welcome In Adress Book Program On Master Branch");

sc.close();
}
}

