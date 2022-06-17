package ruby.designpatterns.objectcreate.singleton;

public class Settings_V1 {

    private static Settings_V1 instance;

    /**
     * 외부에서 new 를 통해 객체를 생성하면 그 때마다 새로운 인스턴스가 생성되므로 외부에서 생성하지 못하도록 private 생성자를 작성한다.
     */
    private Settings_V1 (){}

    public static Settings_V1 getInstance() {
        if (instance == null) instance = new Settings_V1();

        return instance;
    }
}
