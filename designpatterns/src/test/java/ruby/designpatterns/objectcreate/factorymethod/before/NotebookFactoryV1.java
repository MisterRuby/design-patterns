package ruby.designpatterns.objectcreate.factorymethod.before;

import ruby.designpatterns.objectcreate.factorymethod.Grambook;
import ruby.designpatterns.objectcreate.factorymethod.Macbook;
import ruby.designpatterns.objectcreate.factorymethod.Notebook;

public class NotebookFactoryV1 {

    public Notebook createNotebook(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();

        informOrder();

        if (name.equals("mac")) return new Macbook();
        if (name.equals("gram")) return new Grambook();

        throw new IllegalArgumentException();
    }

    private void informOrder () {
        System.out.println("주문이 들어왔습니다.");
    }
}
