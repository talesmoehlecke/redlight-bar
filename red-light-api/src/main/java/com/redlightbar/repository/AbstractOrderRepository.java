package com.redlightbar.repository;

import com.redlightbar.model.AbstractOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractOrderRepository extends JpaRepository<AbstractOrder, Long> {

}
