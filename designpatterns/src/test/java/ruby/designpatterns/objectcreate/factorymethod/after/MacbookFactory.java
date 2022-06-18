package ruby.designpatterns.objectcreate.factorymethod.after;

import ruby.designpatterns.objectcreate.factorymethod.Macbook;
import ruby.designpatterns.objectcreate.factorymethod.Notebook;

public class MacbookFactory implements NotebookFactory {
    
    @Override
    public Notebook createNotebook() {
        return new Macbook();
    }
}
