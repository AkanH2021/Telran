public class Person {
    private String personName;
    private Address address;

    public Person(String name, Address address) {
        this.personName = name;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + personName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
