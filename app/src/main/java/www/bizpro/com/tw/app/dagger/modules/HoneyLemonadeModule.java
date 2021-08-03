package www.bizpro.com.tw.app.dagger.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import www.bizpro.com.tw.app.dagger.models.Honey;
import www.bizpro.com.tw.app.dagger.models.HoneyLemonade;
import www.bizpro.com.tw.app.dagger.models.Lemon;
import www.bizpro.com.tw.app.dagger.models.Lyme;
import www.bizpro.com.tw.app.dagger.models.Water;
import www.bizpro.com.tw.app.dagger.scope.ActivityScope;

@Module
public class HoneyLemonadeModule {

    @Provides
    @Named("LemonFlavor")
    HoneyLemonade provideHoneyLemonade(Honey honey, Lemon lemon) {
        return new HoneyLemonade(honey, lemon);
    }

    @Provides
    @Named("LymeFlavor")
    HoneyLemonade provideHoneyLyme(Honey honey, Lyme lyme) {
        return new HoneyLemonade(honey, lyme);
    }


//    @ActivityScope //This Class Need add abstract
//    @Binds
//    abstract Lemon provideLemon(Lyme lyme);

//    @ActivityScope   //This Class Need remove abstract
//    @Provides
//    Lemon provideLemon(Water water) {
//        return new Lyme(water);
//    }
}
