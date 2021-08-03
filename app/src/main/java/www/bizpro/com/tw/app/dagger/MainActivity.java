package www.bizpro.com.tw.app.dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import www.bizpro.com.tw.app.dagger.components.ApplicationComponent;
import www.bizpro.com.tw.app.dagger.components.DaggerApplicationComponent;
import www.bizpro.com.tw.app.dagger.components.HoneyLemonadeComponent;
import www.bizpro.com.tw.app.dagger.models.HoneyLemonade;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationComponent baseComponent = DaggerApplicationComponent.create();
        HoneyLemonadeComponent component1 = baseComponent.component().create();
        HoneyLemonadeComponent component2 = baseComponent.component().create();
        HoneyLemonade obj = component1.provideHoneyLemonade();
        HoneyLemonade obj2 = component2.provideHoneyLemonade();
        HoneyLemonade obj3= component2.provideHoneyLemonade();
        System.out.println("Honey EQUAL " +obj.getHoney().equals(obj2.getHoney()));
        System.out.println("Bee EQUAL " +obj.getHoney().getBee().equals(obj2.getHoney().getBee()));
        System.out.println("Lemon EQUAL " +obj.getLemon().equals(obj2.getLemon()));
        System.out.println("Lemon EQUAL " +obj2.getLemon().equals(obj3.getLemon()));

    }
}