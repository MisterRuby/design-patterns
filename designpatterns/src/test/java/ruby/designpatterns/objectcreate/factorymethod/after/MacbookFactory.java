package ruby.designpatterns.objectcreate.factorymethod.after;

import ruby.designpatterns.objectcreate.factorymethod.Macbook;
import ruby.designpatterns.objectcreate.factorymethod.Notebook;

public class MacbookFactory implements NotebookFactory {

    /**
     * 팩토리 내에서 구체적인 구현체를 만들어낸다.
     * @return
     */
    @Override
    public Notebook createNotebook() {
        return new Macbook();
    }
}
