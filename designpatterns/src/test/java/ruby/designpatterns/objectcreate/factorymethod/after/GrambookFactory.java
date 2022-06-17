package ruby.designpatterns.objectcreate.factorymethod.after;

import ruby.designpatterns.objectcreate.factorymethod.Grambook;
import ruby.designpatterns.objectcreate.factorymethod.Notebook;

public class GrambookFactory implements NotebookFactory{

    @Override
    public Notebook createNotebook() {
        return new Grambook();
    }
}
