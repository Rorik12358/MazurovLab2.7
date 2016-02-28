package lab2_7_1;

/**
 * Created by m18 on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        EthernetAdapter ethernetAdapter = new EthernetAdapter("HP",12.99F,"GF342PP",124, "196.213.199.15");
        System.out.println(device+"\n"+monitor+"\n"+ethernetAdapter);
        System.out.println(device.equals(device1));
    }
}
