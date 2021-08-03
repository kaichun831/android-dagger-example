package www.bizpro.com.tw.app.dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import www.bizpro.com.tw.app.dagger.components.CoffeeComponent;
import www.bizpro.com.tw.app.dagger.components.DaggerCoffeeComponent;
import www.bizpro.com.tw.app.dagger.models.Coffeemaker;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeeComponent coffeeProvider = DaggerCoffeeComponent.builder().build();
        Coffeemaker coffeeMaker = coffeeProvider.provideCoffeemaker();
        coffeeMaker.brew();
    }
}