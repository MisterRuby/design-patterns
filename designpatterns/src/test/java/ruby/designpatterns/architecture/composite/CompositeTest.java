package ruby.designpatterns.architecture.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {

    @Test
    @DisplayName("컴포짓 패턴 테스트")
    void compositeTest() {
        Item sword = new Item("doranSword", 450);
        Item boots = new Item("berserker's Greaves", 1100);

        Bag bag = new Bag();
        bag.add(sword);
        bag.add(boots);

        assertThat(bag.getPrice()).isEqualTo(1550);
    }

}
