package org.sephora.day2.innerclass;

public class NeedForSubclassExample {

    public static void main(String[] args) {
        var message = new Message("Hello");
        var emailNotifier = new EmailNotifier();
        emailNotifier.notify(message);

        var textNotifier = new TextNotifier();
        textNotifier.notify(message);

        var callNotifier = new CallNotifier();
        callNotifier.notify(message);

        /**
         * The need for inner classes?
         * Inner classes help in localizing important code constructs while still
         * encapsulating them in the form of a class.
         *
         * Example: a text message notifier would need a phone number that sends the text message.
         */
    }
}

/**
 * Send notification
 */
class Notifier {
    void notifyViaEmail(Message message) {
        // Implementation for sending message via email
    }
}

/**
 * Send notification becoming more and more complex?
 * Size of this class will keep on increasing
 * Any OOP principle we can use here?
 */
class ComplexNotifier {
    void notifyViaEmail(Message message) {
        // Implementation for sending message via email
    }

    void notifyViaText(Message message) {
        // Implementation for sending message via text
    }

    void notifyViaCall(Message message) {
        // Implementation for sending message via call
    }
}

/**
 * Solution for ComplexNotifier using inheritance
 */
abstract class ComplexNotifierSimplified {

    abstract void notify(Message message);
}

class EmailNotifier extends ComplexNotifierSimplified {

    @Override
    void notify(Message message) {
        // email specific notification logic
    }
}

class TextNotifier extends ComplexNotifierSimplified {

    @Override
    void notify(Message message) {
        // text specific notification logic

        var connector = new TextConnector("1234");
        connector.connect();
    }

    static class TextConnector {
        private String number;

        TextConnector(String number) {
            this.number = number;
        }

        private void connect() {
            // do something with "number"?
            number = number.toLowerCase();
        }
    }
}

class CallNotifier extends ComplexNotifierSimplified {

    @Override
    void notify(Message message) {
        // call specific notification logic
    }
}

record Message(String text) {
}
