package ruby.designpatterns.objectcreate.singleton;

import java.io.Serializable;

public class Settings_V4 implements Serializable {

    private Settings_V4(){}

    private static class SettingsHolder {
        private static final Settings_V4 INSTANCE = new Settings_V4();
    }

    public static Settings_V4 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * 역직렬화를 사용할 때 해당 메소드를 통하여 인스턴스를 반환하기 때문에 역직렬화 방법을 사용하더라도 단일 인스턴스를 보장할 수 있게 된다.
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
