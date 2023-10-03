package sample.cafekiosk.unit.beverage;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;



class AmericanoTest {
    @Test
    void getName() {
        Americano americano = new Americano();

        //junit을 사용한 것인데 이 방법 사용 안한다.
        //assertEquals(americano.getName(), "아메리카노");

        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();
        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}