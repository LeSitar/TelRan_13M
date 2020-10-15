package de.telran.data;

public class Office {
    private String companyName;
    private Address address;

    public class Address{
        private String street;
        private int houseNumber;

        public Address(String street, int houseNumber) {
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public String getStreet() {
            return street;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Office of " + companyName +
                ", address: " + address;
    }
}
