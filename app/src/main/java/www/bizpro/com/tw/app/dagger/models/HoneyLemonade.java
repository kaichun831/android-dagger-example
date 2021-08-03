package www.bizpro.com.tw.app.dagger.models;

import javax.inject.Inject;

public class HoneyLemonade {
    private final Honey honey ;
    private final Lemon lemon;
    @Inject
    public HoneyLemonade(Honey honey,Lemon lemon) {
        this.honey=honey;
        this.lemon=lemon;
    }
    public Honey getHoney() {
        return honey;
    }
    public Lemon getLemon() {
        return lemon;
    }
}
