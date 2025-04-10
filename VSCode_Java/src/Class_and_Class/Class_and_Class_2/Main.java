package Class_and_Class.Class_and_Class_2;

class Address {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void printAddress() {
        System.out.println(city + "시 " + street + "김");
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.print("주소: ");
        address.printAddress();
    }
}

public class Main {
    public static void main(String[]args) {
        Address addr = new Address("서울", "강남");
        Person p = new Person("홍길동", addr);

        p.printInfo();
    }
}
