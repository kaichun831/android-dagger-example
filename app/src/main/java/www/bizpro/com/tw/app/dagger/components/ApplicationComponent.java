package www.bizpro.com.tw.app.dagger.components;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import www.bizpro.com.tw.app.dagger.MyApplication;
import www.bizpro.com.tw.app.dagger.modules.AppModule;
import www.bizpro.com.tw.app.dagger.modules.BuildersModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,AppModule.class, BuildersModule.class}) //導入有會使用到的Module
public interface AppComponent {

    //將整個App實例化
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(MyApplication application);
        AppComponent build();
    }
    void inject(MyApplication application);
}
