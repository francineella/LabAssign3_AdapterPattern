package adapterPattern;

public class SmartphoneChargerAdapter implements powerOutlet {
    private SmartphoneCharger phone;

    public SmartphoneChargerAdapter(SmartphoneCharger phone){
        this.phone = phone;
    }
    @Override
    public String plugIn(){
        return phone.chargePhone();
    }
}