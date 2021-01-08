/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dto;

/**
 *
 * @author mastermind
 */
public class Address {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String City;
    private String State;
    private String zipCode;
    
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    
    public String getStreetAddress(){
        return streetAddress;
    }
    
    public void setCity(String City){
        this.City = City;
    }
    
    public String getCity(){
        return City;
    }
    
    public void setState(String State){
        this.State = State;
    }
    
    public String getState(){
        return State;
    }
    
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    
    public String getZipCode(){
        return zipCode;
    }
    
}
