package www.bizpro.com.tw.app.dagger.models;

import www.bizpro.com.tw.app.dagger.interfaceFunction.Heater;

public class ElectricHeater implements Heater {
    private boolean heating = false;

    @Override
    public void on() {
        System.out.println("~ ~ ~ This is Magic ~ ~ ~");
        System.out.println("~ ~ ~ heating ~ ~ ~");
        System.out.println("~ ~ ~ magic ~ ~ ~");
            heating = true;
    }

    @Override
    public void off() {
        System.out.println("~ ~ ~ close ~ ~ ~");
        heating = false;

    }

    @Override
    public boolean isHot() {
        return heating;
    }
}

