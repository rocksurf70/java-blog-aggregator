package com.jmillar.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmillar.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
