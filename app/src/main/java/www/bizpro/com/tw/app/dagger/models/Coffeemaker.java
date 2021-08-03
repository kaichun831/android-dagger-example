package www.bizpro.com.tw.app.dagger.models;


import javax.inject.Inject;

import www.bizpro.com.tw.app.dagger.interfaceFunction.Heater;
import www.bizpro.com.tw.app.dagger.interfaceFunction.Pump;

public class Coffeemaker {
    private Heater heater;
    private Pump pump;
    @Inject
    public Coffeemaker(Heater heater,Pump pump){
        this.heater=heater;
        this.pump=pump;
    }
    public void brew(){
        heater.on();
        pump.pump();
        System.out.println("Coffee Building");
        heater.off();
    }
}
