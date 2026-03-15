package com.assignemnt.ttaluri.controller;

import com.assignemnt.ttaluri.model.Item;
import com.assignemnt.ttaluri.repository.ItemRepository;
import com.assignemnt.ttaluri.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Tells spring - this calls handles REST API requests
@RequestMapping("/items") //all endpoints will start with items
public class ItemController {

    @Autowired
    private ItemService itemService;

    //CREATE - add Item
    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    //READ - Get all Items
    @GetMapping
    public List<Item> getItems(){
        return itemService.getAllItems();
    }

    //UPDATE
    @PutMapping("/{id}/quantity")
    public Item updateQuantity(@PathVariable Integer id, @RequestParam int quantity){
        return itemService.updateQuantity(id, quantity);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }

}
