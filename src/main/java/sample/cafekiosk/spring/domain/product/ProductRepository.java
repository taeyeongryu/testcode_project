package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    /**
     * select *
     * from product
     * where selling_type in ('SELLING', 'HOLD');
     * 이런 쿼리가 나가기를 기대하면서 작성한 코드
     */
    List<Product> findAllBySellingTypeIn(List<ProductSellingType> sellingTypes);
}
