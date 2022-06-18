package ruby.designpatterns.objectcreate.abstractfactory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ruby.designpatterns.objectcreate.abstractfactory.factory.IPhoneFactory;
import ruby.designpatterns.objectcreate.abstractfactory.factory.IPhonePartsFactory;
import ruby.designpatterns.objectcreate.abstractfactory.factory.IPhonePartsProFactory;
import ruby.designpatterns.objectcreate.abstractfactory.factory.PhoneFactory;
import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.IPhoneCamera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.IPhoneCameraPro;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.IPhoneScreen;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.IPhoneScreenPro;
import ruby.designpatterns.objectcreate.abstractfactory.phone.Phone;

public class AbstractFactoryTest {

    /**
     * Parts 를 만드는 Factory 를 외부에서 결정하며 새로운 Factory 를 만들 때 이전 Factory 를 수정할 필요가 없다.
     */
    @Test
    @DisplayName("추상 메소드 패턴 테스트")
    void abstractFactoryTest() {
        PhoneFactory iPhoneFactory = new IPhoneFactory(new IPhonePartsFactory());
        Phone iPhone = iPhoneFactory.createPhone();

        PhoneFactory iPhoneProFactory = new IPhoneFactory(new IPhonePartsProFactory());
        Phone iPhonePro = iPhoneProFactory.createPhone();

        Assertions.assertThat(iPhone.getScreen()).isInstanceOf(IPhoneScreen.class);
        Assertions.assertThat(iPhonePro.getScreen()).isInstanceOf(IPhoneScreenPro.class);
    }
}
