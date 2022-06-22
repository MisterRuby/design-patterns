package ruby.designpatterns.architecture.bridge.champion;

import ruby.designpatterns.architecture.bridge.champion.DefaultChampion;
import ruby.designpatterns.architecture.bridge.skin.Skin;

/**
 * DefaultChampion 을 변경하지 않고 추가로 확장
 */
public class Ahri extends DefaultChampion {

    public Ahri(Skin skin) {
        super(skin, "Ahri");
    }
}
