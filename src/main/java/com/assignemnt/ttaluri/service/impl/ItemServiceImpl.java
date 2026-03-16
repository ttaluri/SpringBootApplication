package com.assignemnt.ttaluri.service.impl;

import com.assignemnt.ttaluri.model.Item;
import com.assignemnt.ttaluri.repository.ItemRepository;
import com.assignemnt.ttaluri.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ItemServiceImpl implements ItemService {

        @Autowired
        private ItemRepository itemRepository; //This repo handles DB operations - spring Data JPA automatically provides methods like save, find al etc

        public Item addItem(Item item){
            return itemRepository.save(item);
        }

        public List<Item> getAllItems(){
            return itemRepository.findAll();
        }

        public Item updateQuantity(Integer id, Integer quantity) {

            Item item = itemRepository.findById(id).orElse(null);

            if (item != null) {
                item.setQuantity(quantity);
                return itemRepository.save(item);
            }
            return null;
        }

        public void deleteItem(Integer id){
            itemRepository.deleteById(id);
        }
    }
