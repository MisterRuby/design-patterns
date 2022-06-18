package ruby.designpatterns.objectcreate.abstractfactory.factory;

import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.Camera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.IPhoneCameraPro;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.IPhoneScreenPro;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.Screen;

public class IPhonePartsProFactory implements PhonePartsFactory{
    @Override
    public Screen createScreen() {
        return new IPhoneScreenPro();
    }

    @Override
    public Camera createCamera() {
        return new IPhoneCameraPro();
    }
}
