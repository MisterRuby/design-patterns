package ruby.designpatterns.objectcreate.abstractfactory.factory;

import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.Camera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.IPhoneCamera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.IPhoneScreen;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.Screen;

/**
 * 추상 팩토리에서 정의한 규약을 지켜 IPhone 에 필요한 parts 들을 만들게됨
 */
public class IPhonePartsFactory implements PhonePartsFactory{
    @Override
    public Screen createScreen() {
        return new IPhoneScreen();
    }

    @Override
    public Camera createCamera() {
        return new IPhoneCamera();
    }
}
