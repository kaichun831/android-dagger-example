package www.bizpro.com.tw.app.dagger.models;

import javax.inject.Inject;

import www.bizpro.com.tw.app.dagger.interfaceFunction.Heater;
import www.bizpro.com.tw.app.dagger.interfaceFunction.Pump;

public class Thermosiphon implements  Pump{
    private Heater heater;
    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if(heater.isHot()){
            System.out.println("> > > PUMP > > >");
        }
    }
}
