package com.safecharge.retail.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.safecharge.retail.util.APIConstants;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/14/2017
 */
public class UserDetails {

    @Size(max = APIConstants.FIRST_NAME_MAX_LENGTH) private String firstName;

    @Size(max = APIConstants.LAST_NAME_MAX_LENGTH) private String lastName;

    @Pattern(regexp = APIConstants.EMAIL_REGEX) private String email;

    @Size(max = APIConstants.PHONE_MAX_LENGTH) private String phone;

    @Size(max = APIConstants.ADDRESS_MAX_LENGTH) private String address;

    @Size(max = APIConstants.CITY_MAX_LENGTH) private String city;

    @Size(max = 2) private String country;

    @Size(max = 2) private String state;

    @Size(max = APIConstants.ZIP_MAX_LENGTH) private String zip;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
