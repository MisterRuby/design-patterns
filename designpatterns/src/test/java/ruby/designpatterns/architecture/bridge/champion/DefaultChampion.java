package ruby.designpatterns.architecture.bridge.champion;

import ruby.designpatterns.architecture.bridge.skin.Skin;

public class DefaultChampion implements Champion{

    private Skin skin;
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", this.skin.getName(), this.name);
    }

    @Override
    public void attack() {
        System.out.printf("%s %s attack\n", this.skin.getName(), this.name);
    }

    @Override
    public void skill() {
        System.out.printf("%s %s skill\n", this.skin.getName(), this.name);
    }
}
