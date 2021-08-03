package www.bizpro.com.tw.app.dagger.models;

import javax.inject.Inject;

public class Honey {
    private final Bee bee;

    @Inject
    public Honey(Bee bee) {
        this.bee = bee;
    }

    public Bee getBee() {
        return bee;
    }
}
