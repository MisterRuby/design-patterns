package ruby.designpatterns.objectcreate.singleton;

/**
 * enum 을 활용하여 단일 인스턴스를 보장
 * - 리플렉션으로도 뚫을 수 없다.
 */
public enum Settings_V5 {

    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
