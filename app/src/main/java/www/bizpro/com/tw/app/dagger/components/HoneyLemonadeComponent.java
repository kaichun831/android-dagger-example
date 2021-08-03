package www.bizpro.com.tw.app.dagger.components;

import dagger.Component;
import www.bizpro.com.tw.app.dagger.MainActivity;
import www.bizpro.com.tw.app.dagger.modules.HoneyLemonadeModule;
import www.bizpro.com.tw.app.dagger.scope.ActivityScope;

@ActivityScope
@Component(modules = HoneyLemonadeModule.class)
public interface HoneyLemonadeComponent {
    //    HoneyLemonade provideHoneyLemonade();
    void inject(MainActivity mainActivity);
}
