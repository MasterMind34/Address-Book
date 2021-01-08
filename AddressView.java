/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.ui;

import com.sg.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mastermind
 */
public class AddressView {
    //Dependency Injection
    // private UserIO io = new UserIOConsoleImpl();
    private UserIO io;
    public AddressView(UserIO io) {
    this.io = io;
}
    

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Address");
        io.print("2. Create New Address");
        io.print("3. View a Address");
        io.print("4. Remove a Address");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    
    public Address getNewAddressInfo() {
    String firstName = io.readString("Please enter the  First Name");
    String lastName = io.readString("Please enter the  Last Name");
    String streetAddress = io.readString("Please enter the  Street Address");
    String City = io.readString("Please enter the City");
    String State = io.readString("Please  enter the  State");
    String zipCode = io.readString("Please enter the  ZipCode");
    Address currentAddress = new Address ();
    currentAddress.setFirstName(firstName);
    currentAddress.setLastName(lastName);
    currentAddress.setStreetAddress(streetAddress);
    currentAddress.setCity(City);
    currentAddress.setState(State);
    currentAddress.setZipCode(zipCode);
    return currentAddress;
}
    public void displayCreateAddressBanner() {
    io.print("=== Create Address ===");
}
    public void displayCreateSuccessBanner() {
    io.readString(
            "Address successfully created.  Please hit enter to continue");
}
    
   
    public void displayAddressList(List<Address> addressList) {
    for (Address currentAddress : addressList) {
        String addressInfo = String.format("%s : %s ",
              currentAddress.getFirstName(),
              currentAddress.getLastName());
              
             
              
              
              
        
              
        io.print(addressInfo);
    }
    io.readString("Please hit enter to continue.");
}
    
    public void displayDisplayAllBanner() {
    io.print("=== Display All Addresses ===");
}
    
    public void displayDisplayAddressBanner () {
    io.print("=== Display Address ===");
}

public String getAddressByChoice() {
    return io.readString("Please enter the Last Name.");
}

public void displayAddress(Address address) {
    if (address != null) {
        
        io.print(address.getFirstName() + " " + address.getLastName());
        io.print(address.getStreetAddress() + " " + address.getCity() + " " + address.getState());
        io.print("");
    } else {
        io.print("No such Address.");
    }
    io.readString("Please hit enter to continue.");


}
public void displayRemoveAddressBanner () {
    io.print("=== Remove Address ===");
}

public void displayRemoveResult(Address addressRecord) {
    if(addressRecord != null){
      io.print("Address successfully removed.");
    }else{
      io.print("No such Address.");
    }
    io.readString("Please hit enter to continue.");
}
public void displayExitBanner() {
    io.print("Good Bye!!!");
}

public void displayUnknownCommandBanner() {
    io.print("Unknown Command!!!");
}    


}
