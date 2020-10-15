package de.telran.data;

public class Clinic {
    private String street;
    private int houseNumber;
    private String name;

    public Clinic(String street, int houseNumber, String name) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.name = name;
    }

    public interface AddressContainer{
        String getStreet();
        int getHouseNumber();
    }

    public AddressContainer getAddressContainer(){
        class ClinicAddressContainer implements AddressContainer {
            String street = Clinic.this.street;
            int houseNumber = Clinic.this.houseNumber;

            public String getStreet() {
                return street;
            }

            @Override
            public int getHouseNumber() {
                return houseNumber;
            }
        }
        return new ClinicAddressContainer();
    }

    public static void main(String[] args) {
        Clinic clinic = new Clinic("Berliner", 12, "Charite");
        Clinic.AddressContainer address = clinic.getAddressContainer();
        System.out.println(address.getHouseNumber());
        System.out.println(address.getStreet());


    }
}
