package www.bizpro.com.tw.app.dagger.components;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface ApplicationComponent {
    HoneyLemonadeComponent.Factory component();
}
