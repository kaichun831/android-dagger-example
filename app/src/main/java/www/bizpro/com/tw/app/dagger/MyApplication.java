package www.bizpro.com.tw.app.dagger;

import android.app.Application;




public  class MyApplication extends Application {
    static MyApplication application;
    public  synchronized static MyApplication getInstance(){
        return application;
    }
}
