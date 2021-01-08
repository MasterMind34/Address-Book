/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook;

import com.sg.addressbook.controller.AddressController;
import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressDaoFileImpl;
import com.sg.addressbook.ui.AddressView;
import com.sg.addressbook.ui.UserIO;
import com.sg.addressbook.ui.UserIOConsoleImpl;

/**
 *
 * @author mastermind
 */
public class App {

    public static void main(String[] args) {

        UserIO myIo = new UserIOConsoleImpl();
        AddressView myView = new AddressView(myIo);
        AddressBookDao myDao = new AddressDaoFileImpl();
        AddressController controller
                = new AddressController(myDao, myView);
        controller.run();
    }
}
