package ruby.designpatterns.objectcreate.abstractfactory.phone;

import ruby.designpatterns.objectcreate.abstractfactory.parts.camera.Camera;
import ruby.designpatterns.objectcreate.abstractfactory.parts.screen.Screen;

public class Phone {

    private Screen screen;
    private Camera camera;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
