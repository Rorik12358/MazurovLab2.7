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
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("HP", 12.99F, "GF342PP", 124, "196.213.199.15");
        System.out.println(device+"\n"+monitor+"\n"+ethernetAdapter);
        System.out.println(device.equals(device1));
        Device[] devices = {device, device1, new Device("Lenovo", 152.98F, "JJ1541AL")};
        Monitor[] monitors = {monitor, monitor1, new Monitor("Lenovo", 152.98F, "JJ1541AL", 2048, 4096)};
        EthernetAdapter[] ethernetAdapters = {ethernetAdapter, ethernetAdapter1, new EthernetAdapter("Lenovo", 152.98F, "JJ1541AL", 64, "199.255.255.129")};
        Device[] devicesForPrint = new Device[devices.length + monitors.length + ethernetAdapters.length];
        System.out.println("Print arrays:");
        for (int i = 0; i < devicesForPrint.length; i++) {
            for (int j = 0; j < devices.length; j++) {
                devicesForPrint[i] = devices[j];
                System.out.println(devices[j]);
                i++;
            }
            for (int j = 0; j < devices.length; j++) {
                devicesForPrint[i] = monitors[j];
                System.out.println(monitors[j]);
                i++;
            }
            for (int j = 0; j < devices.length; j++) {
                devicesForPrint[i] = ethernetAdapters[j];
                System.out.println(ethernetAdapters[j]);
                i++;
            }
        }
        System.out.println();
        for (int i = 0; i < devicesForPrint.length; i++) {
            System.out.println(devicesForPrint[i]);
        }
    }
}
