package com.redlightbar.repository;

import com.redlightbar.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EntryRepository extends JpaRepository<Entry, Long> {

}
