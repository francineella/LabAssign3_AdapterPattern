package adapterPattern;

public class StandardPowerOutlet {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        powerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        powerOutlet refPowerOutlet = new RefrigeratorAdapter(ref);

        SmartphoneCharger phone = new SmartphoneCharger();
        powerOutlet phonePowerOutlet = new SmartphoneChargerAdapter(phone);

        System.out.println(laptopPowerOutlet.plugIn());
        System.out.println(refPowerOutlet.plugIn());
        System.out.println(phonePowerOutlet.plugIn());
    }
}