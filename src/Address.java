public class Address {

    private String street;
    private int nuberB;

    public Address(String street, int nuberB) {
        this.street = street;
        this.nuberB = nuberB;
    }

    public String getStreet() {
        return street;
    }

    public int getNuberB() {
        return nuberB;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", nuberB=" + nuberB +
                '}';
    }
}
