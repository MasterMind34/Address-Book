/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mastermind
 */
public class AddressDaoFileImpl implements AddressBookDao{
    
    private Map<String, Address> location  = new HashMap<>();
    
    public Address addAddress(String firstName, Address address) {
    Address prevAddress;
        prevAddress = location.put(firstName, address );
    return prevAddress;
    }

    @Override
    public ArrayList<Address> getAllAddresses() {
        return new ArrayList<Address>(location.values());
    }

    @Override
    public Address getAddress(String lastName) {
        return location.get(lastName);
    }
        
    @Override
    public Address removeAddress( String lastName) {
        Address removedAddress = location.remove(lastName);
    return removedAddress;
    }

    

    

    
    
}
