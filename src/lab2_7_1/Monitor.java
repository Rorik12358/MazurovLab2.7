package lab2_7_1;

/**
 * Created by m18 on 26.02.2016.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "manufacorer="+getManufacturer()+","+
                "price="+getPrice()+
                "serialNumber="+getSerialNumber()+","+
                "resolutionX=" + resolutionX +","+
                "resolutionY=" + resolutionY;
    }

}
