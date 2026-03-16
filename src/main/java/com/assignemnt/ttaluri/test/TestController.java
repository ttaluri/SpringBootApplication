package com.assignemnt.ttaluri.test;

import com.assignemnt.ttaluri.model.Item;
import com.assignemnt.ttaluri.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/test")
    public String test() {
        Item item = new Item();
        item.setItemName("Phone");
        item.setQuantity(10);
        item.setItemPrice(500);

        itemService.addItem(item);

        return "Item added";
    }
}