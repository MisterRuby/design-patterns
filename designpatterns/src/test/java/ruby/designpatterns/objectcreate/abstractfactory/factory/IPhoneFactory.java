package ruby.designpatterns.objectcreate.abstractfactory.factory;

import ruby.designpatterns.objectcreate.abstractfactory.phone.IPhone;
import ruby.designpatterns.objectcreate.abstractfactory.phone.Phone;

public class IPhoneFactory implements PhoneFactory{
    private PhonePartsFactory partsFactory;

    /**
     * partsFactory 의 구현 객체는 외부에서 정하게 된다.
     * - IPhonePartsFactory 를 사용할 것인 PhonePartsProFactory 를 사용할 것인지 외부에서 결정
     * @param partsFactory
     */
    public IPhoneFactory (PhonePartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    @Override
    public Phone createPhone() {
        IPhone iPhone = new IPhone();
        iPhone.setScreen(partsFactory.createScreen());
        iPhone.setCamera(partsFactory.createCamera());

        return iPhone;
    }
}
