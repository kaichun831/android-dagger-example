package www.bizpro.com.tw.app.dagger.components;

import dagger.Component;
import dagger.Provides;
import www.bizpro.com.tw.app.dagger.models.Coffeemaker;
import www.bizpro.com.tw.app.dagger.modules.CoffeeMakerModule;

@Component(modules = {CoffeeMakerModule.class})
public interface CoffeeComponent {

    Coffeemaker provideCoffeemaker();
}
