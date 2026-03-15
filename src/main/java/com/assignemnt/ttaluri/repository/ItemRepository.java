package com.assignemnt.ttaluri.repository;

import com.assignemnt.ttaluri.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository -> has predef methods like save(), findAll(), findById(), deleteById(), count()
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
