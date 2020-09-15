package de.telran.data;

public class Address {
    private String city, street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    String getCity() {
        return city;
    }

    String getStreet() {
        return street;
    }

    int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getHouseNumber() != address.getHouseNumber()) return false;
        if (!getCity().equals(address.getCity())) return false;
        return getStreet().equals(address.getStreet());

    }

    @Override
    public int hashCode() {
        int result = getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getHouseNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Address: " + city +
                ", " + street +
                ", " + houseNumber;
    }
}
