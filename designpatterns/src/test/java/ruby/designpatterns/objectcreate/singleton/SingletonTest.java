package ruby.designpatterns.objectcreate.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("리플렉션을 통한 싱글톤 깨트리기")
    void reflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings_V4 settings = Settings_V4.getInstance();

        Constructor<Settings_V4> constructor = Settings_V4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings_V4 reflectionInstance = constructor.newInstance();

        assertThat(settings).isNotEqualTo(reflectionInstance);
    }

    @Test
    @DisplayName("직렬화 및 역직렬화를 통한 싱글톤 깨트리기")
    void serializationAndDeserialization() throws IOException, ClassNotFoundException {
        Settings_V4 settings1 = Settings_V4.getInstance();
        Settings_V4 settings2;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings_V4) in.readObject();
        }

        assertThat(settings1).isNotEqualTo(settings2);
    }

    @Test
    @DisplayName("enum 을 활용한 싱글톤 객체 보장")
    void testMethod() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings_V5 settings = Settings_V5.INSTANCE;

        Settings_V5 settings1;
        Constructor<?>[] declaredConstructors = Settings_V5.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            settings1 = (Settings_V5) constructor.newInstance("INSTANCE");
        }
    }

    @Test
    @DisplayName("싱글톤 사용 예시")
    void exampleSingleton() {
        Runtime runtime = Runtime.getRuntime();
    }
}
