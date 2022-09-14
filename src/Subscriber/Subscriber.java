package Subscriber;

public class Subscriber {

    public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String emailAddress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.emailAddress = emailAddress;
    }

    private String firstName;
    private String lastName;
    private SubscriberAddress subscriberAddress;
    private String emailAddress;
    private int age;

    @Override
    public String toString() {
        return ("First name: " + firstName + " Last name: " + lastName + " Subscriber address " + subscriberAddress + " Email address: " + emailAddress + " Age: " + age);

    }

}
