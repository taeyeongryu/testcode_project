package sample.cafekiosk.spring.domain.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductTypeTest {
    @DisplayName("상품 타입이 재고 관련 타입인지를 체크한다.")
    @Test
    void containsStockType(){
        //given
        ProductType givenType = ProductType.BAKERY;
        //when
        boolean result = ProductType.containsStockType(givenType);
        //then
        assertThat(result).isTrue();
    }
    @DisplayName("상품 타입이 재고 관련 타입인지를 체크한다.")
    @Test
    void containsStockType3(){
        //given
        ProductType givenType1 = ProductType.HANDMADE;
        ProductType givenType2 = ProductType.BAKERY;
        ProductType givenType3 = ProductType.BOTTLE;

        //when
        boolean result1 = ProductType.containsStockType(givenType1);
        boolean result2 = ProductType.containsStockType(givenType2);
        boolean result3 = ProductType.containsStockType(givenType3);

        //then
        assertThat(result1).isFalse();
        assertThat(result2).isTrue();
        assertThat(result3).isTrue();
    }

    //위와 같이 작성하는 것 보다 아래처럼 작성하는 것이 좋다.
    @DisplayName("상품 타입이 재고 관련 타입인지를 체크한다.")
    @CsvSource({"HANDMADE,false", "BOTTLE,true", "BAKERY,true"})
    @ParameterizedTest
    void containsStockType4(ProductType productType, boolean expected) {
        //when
        boolean result = productType.containsStockType(productType);

        //then
        assertThat(result).isEqualTo(expected);
    }
}