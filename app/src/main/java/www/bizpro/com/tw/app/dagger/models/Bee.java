package www.bizpro.com.tw.app.dagger.models;

import javax.inject.Inject;
import javax.inject.Singleton;

import www.bizpro.com.tw.app.dagger.scope.ActivityScope;

@ActivityScope  //欲共用的類別打上標籤,並且在Component也必須使用相同標籤
public class Bee {

    @Inject
    public Bee() {
    }

}
