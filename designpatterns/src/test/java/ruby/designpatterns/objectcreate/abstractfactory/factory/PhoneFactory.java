package ruby.designpatterns.objectcreate.abstractfactory.factory;

import ruby.designpatterns.objectcreate.abstractfactory.phone.Phone;

public interface PhoneFactory {

    default Phone create() {
        return createPhone();
    }

    /**
     * ConcreteCreator 에서 구현한 메서드에 따라 다른 Phone 을 생성해서 반환
     *  - 팩토리 메서드 패턴 참고
     * @return
     */
    Phone createPhone();
}
