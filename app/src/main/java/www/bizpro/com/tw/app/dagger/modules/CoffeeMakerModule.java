package www.bizpro.com.tw.app.dagger.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import www.bizpro.com.tw.app.dagger.interfaceFunction.Heater;
import www.bizpro.com.tw.app.dagger.interfaceFunction.Pump;
import www.bizpro.com.tw.app.dagger.models.ElectricHeater;
import www.bizpro.com.tw.app.dagger.models.Thermosiphon;

@Module
public class CoffeeMakerModule {

    @Provides
    Heater provideHeater(){
        return new ElectricHeater();
    }
    @Provides
    Pump providePump(){
        return  new Thermosiphon(new ElectricHeater());
    }
}

