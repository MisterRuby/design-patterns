package ruby.designpatterns.objectcreate.singleton;

public class Settings_V3 {

    // volatile :
    private static volatile Settings_V3 instance;

    private Settings_V3 (){}

    /**
     * Double-Checked Locking 으로 효율적인 동기화 블럭 구성
     *  - 메서드 내부에서 instance 가 null 인지 체크하는 부분에서 동기화 처리를 함
     *  - instance 가 생성되어 있다면 메서드를 호출하더라도 동기화 처리를 하지 않게 된다.
     * @return
     */
    public static Settings_V3 getInstance() {
        if (instance == null) {
            synchronized (Settings_V3.class) {
                if (instance == null) {
                    instance = new Settings_V3();
                }
            }
        }
        return instance;
    }
}
