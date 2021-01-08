/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mastermind
 */
public interface AddressBookDao {
    
    Address addAddress(String firstName, Address address);

    
    ArrayList<Address> getAllAddresses();

    
    Address getAddress(String lastName);

    
    Address removeAddress(String lastName);
}
    

