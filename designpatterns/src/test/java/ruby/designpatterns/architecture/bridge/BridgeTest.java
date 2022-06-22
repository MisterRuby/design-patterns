package ruby.designpatterns.architecture.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ruby.designpatterns.architecture.bridge.champion.Champion;
import ruby.designpatterns.architecture.bridge.champion.Ahri;
import ruby.designpatterns.architecture.bridge.skin.KDA;
import ruby.designpatterns.architecture.bridge.skin.Skin;

import java.util.Date;

public class BridgeTest {
    @Test
    @DisplayName("")
    void testMethod() {
        Skin skin = new KDA();
        Champion ahri = new Ahri(skin);
        ahri.attack();
        ahri.skill();
        ahri.move();
    }
}
