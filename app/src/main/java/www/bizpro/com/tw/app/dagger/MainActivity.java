package www.bizpro.com.tw.app.dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import www.bizpro.com.tw.app.dagger.components.DaggerHoneyLemonadeComponent;
import www.bizpro.com.tw.app.dagger.models.HoneyLemonade;


public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("LemonFlavor")
    HoneyLemonade honeyLemonade1;
    @Inject
    @Named("LymeFlavor")
    HoneyLemonade honeyLemonade2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DaggerHoneyLemonadeComponent.builder().build().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        HoneyLemonade honeyLemonade =  DaggerHoneyLemonadeComponent.builder().build().provideHoneyLemonade();
        System.out.println(honeyLemonade1.getLemon().getClass().getSimpleName());
        System.out.println(honeyLemonade2.getLemon().getClass().getSimpleName());

    }
}