package org.sid.billingservice.repository;

import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;
import java.util.List;
@RepositoryRestController
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {


     Collection<ProductItem> findByBillId(Long id);

    // List<ProductItem> findByBillId(Long billID);
}
