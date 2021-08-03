package www.bizpro.com.tw.app.dagger.modules;

import dagger.Binds;
import dagger.Module;
import www.bizpro.com.tw.app.dagger.interfaceFunction.Pump;
import www.bizpro.com.tw.app.dagger.models.Thermosiphon;

@Module
public abstract  class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump );
}
