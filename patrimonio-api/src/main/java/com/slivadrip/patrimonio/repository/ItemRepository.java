package com.slivadrip.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slivadrip.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
