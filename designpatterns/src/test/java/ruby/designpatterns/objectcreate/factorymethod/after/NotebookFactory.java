package ruby.designpatterns.objectcreate.factorymethod.after;

import ruby.designpatterns.objectcreate.factorymethod.Notebook;

// Creator
public interface NotebookFactory {

    default Notebook orderNotebook() {
        informOrder();
        return createNotebook();
    }

    Notebook createNotebook();

    private void informOrder () {
        System.out.println("주문이 들어왔습니다.");
    }
}
