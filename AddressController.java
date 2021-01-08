/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.controller;


import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressDaoFileImpl;
import com.sg.addressbook.dto.Address;
import com.sg.addressbook.ui.AddressView;
import com.sg.addressbook.ui.UserIO;
import com.sg.addressbook.ui.UserIOConsoleImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mastermind
 */
public class AddressController {
    // Dependency Injection
    // private AddressView view = new AddressView();
    // private AddressBookDao dao = new AddressDaoFileImpl();
    private AddressView view;
  private AddressBookDao dao;
    private UserIO io = new UserIOConsoleImpl();
    
    public AddressController(AddressBookDao dao, AddressView view) {
    this.dao = dao;
    this.view = view;
}
    
    

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listAddress();
                    break;
                case 2:
                    createAddress();
                    break;
                case 3:
                    viewAddress();
                    break;
                case 4:
                    removeAddress();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                     unknownCommand();
            }

        }
        exitMessage();
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createAddress() {
    view.displayCreateAddressBanner();
    Address newAddress = view.getNewAddressInfo();
    dao.addAddress(newAddress.getLastName(), newAddress);
    view.displayCreateSuccessBanner();
}
    
    private void listAddress() {
    view.displayDisplayAllBanner();
    ArrayList<Address> addressList = dao.getAllAddresses();
    view.displayAddressList(addressList);
}
    private void viewAddress() {
    view.displayDisplayAddressBanner();
    String viewAddress = view.getAddressByChoice();
    Address address = dao.getAddress(viewAddress);
    view.displayAddress(address);
}
    private void removeAddress() {
    view.displayRemoveAddressBanner();
    String address = view.getAddressByChoice();
    Address removedAddress = dao.removeAddress(address);
    view.displayRemoveResult(removedAddress);
}
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

private void exitMessage() {
    view.displayExitBanner();
}
    
    
}

