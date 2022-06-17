package ruby.designpatterns.objectcreate.singleton;

public class Settings_V2_2 {

    /**
     * 인스턴스를 생성하는 비용이 크지 않다면 이른 초기화(Eager Initialization) 방법으로 인스턴스 제공
     *  - 멀티쓰레드 환경에서도 유일한 인스턴스를 보장함
     *  - 애플리케이션에서 쓰지 않거나 비용이 크다면 메모리 낭비가 된다.
     */
    private static final Settings_V2_2 INSTANCE = new Settings_V2_2();

    private Settings_V2_2 (){}

    public static Settings_V2_2 getInstance() {
        return INSTANCE;
    }
}
