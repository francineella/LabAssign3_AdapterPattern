package adapterPattern;

public class RefrigeratorAdapter implements powerOutlet {
    private Refrigerator ref;

    public RefrigeratorAdapter(Refrigerator ref){
        this.ref = ref;
    }
    @Override
    public String plugIn(){
        return ref.startCooling();
    }
}