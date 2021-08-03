package www.bizpro.com.tw.app.dagger.components;

import dagger.Component;
import dagger.Subcomponent;
import www.bizpro.com.tw.app.dagger.MainActivity;
import www.bizpro.com.tw.app.dagger.models.HoneyLemonade;
import www.bizpro.com.tw.app.dagger.modules.HoneyLemonadeModule;
import www.bizpro.com.tw.app.dagger.scope.ActivityScope;

@ActivityScope
@Subcomponent(modules = HoneyLemonadeModule.class)
public interface HoneyLemonadeComponent {
    HoneyLemonade provideHoneyLemonade();
    @Subcomponent.Factory
    interface  Factory{
        HoneyLemonadeComponent create();
    }
    void inject(MainActivity mainActivity);

}
