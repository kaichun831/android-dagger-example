package www.bizpro.com.tw.app.dagger.models;

import javax.inject.Inject;

public class Lyme  extends  Lemon{
    private final Water water;
    @Inject
    public Lyme(Water water) {
        this.water=water;
    }
}
