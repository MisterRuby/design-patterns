package ruby.designpatterns.objectcreate.abstractfactory.factory;

import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.Camera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.Screen;

/**
 * 추상 팩토리
 */
public interface PhonePartsFactory {

    Screen createScreen();

    Camera createCamera();

}
