package com.assignemnt.ttaluri.service;

import com.assignemnt.ttaluri.model.Item;
import com.assignemnt.ttaluri.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository; //This repo handles DB operations - spring Data JPA automatically provides methods like save, find al etc

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item updateQuantity(Integer id, int quantity) {

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
