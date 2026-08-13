

interface Camera {

    void takeSnap();

    void recordVidea();
}

interface wifi {

    String[] getNetworks();

    void connectNetwork(String network);
}

class MyCellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class Smartphone extends MyCellPhone implements Camera, wifi {

    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVidea() {
        System.out.println("Recording Video");
    }

    public String[] getNetworks() {
        System.out.println("Getting available networks...");

        String[] networks = {
            "Jio",
            "Airtel",
            "Vi"
        };

        return networks;
    }

    public void connectNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class javac{

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        // MyCellPhone methods
        phone.callNumber(987654321);
        phone.pickCall();

        // Camera methods
        phone.takeSnap();
        phone.recordVidea();

        // WiFi methods
        String[] networks = phone.getNetworks();

        for (String network : networks) {
            System.out.println(network);
        }

        phone.connectNetwork("Jio");
    }
}