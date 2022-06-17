package ruby.designpatterns.objectcreate.singleton;

public class Settings_V2_1 {

    private static Settings_V2_1 instance;

    private Settings_V2_1 (){}

    /**
     * synchronized 키워드를 사용하여 동기화. 해당 메서드는 여러 쓰레드에서 동시에 실행될 수 없게되어 단 하나의 인스턴스 생성을 보장한다.
     * - 다만 동기화를 위한 작업이 필요하므로 성능이 떨어질 수 있다.
     * @return
     */
    public static synchronized Settings_V2_1 getInstance() {
        if (instance == null) instance = new Settings_V2_1();

        return instance;
    }
}
