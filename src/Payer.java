public class Payer {
    private String surname, name, address, cardNumber;


    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }
    public String toString() {
        System.out.printf("Payer: %s %s, address: %s, card: %s.", surname, name, address, cardNumber);
        return null;
    }
}
