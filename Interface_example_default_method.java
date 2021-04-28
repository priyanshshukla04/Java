interface Camera{
    void takePhoto();
    void recordVideo();
    private void passcode(){
        System.out.println("Passcode is xxxxx34");
    }
    default void Company(String name){
        passcode();
        System.out.println("Company is: "+name);
    }
}

interface Wifi{
    String[] networks();
    void ConnectNetwork();
}

class CellPhone{
    void Call(){
        System.out.println("Calling...");
    }
    void ReceiveCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera,Wifi{
    public void takePhoto(){
        System.out.println("Taking photo...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public String[] networks(){
        String[] availableNetworks = {"Anshul","Saumya","Tenda"};
        return availableNetworks;
    }
    public void ConnectNetwork() {
        System.out.println("Connecting to network...");
    }
}

public class Interface_example_default_method {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.takePhoto();
        sm.recordVideo();
        String[] arr = sm.networks();
        for(String i : arr){
            System.out.println(i);
        }
        sm.ConnectNetwork();
        sm.Call();
        sm.ReceiveCall();
        sm.Company("Indiees");

    }
}
