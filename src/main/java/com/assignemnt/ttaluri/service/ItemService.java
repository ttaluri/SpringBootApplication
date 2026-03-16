package com.assignemnt.ttaluri.service;

import com.assignemnt.ttaluri.model.Item;
import com.assignemnt.ttaluri.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {

    public Item addItem(Item item);

    public List<Item> getAllItems();

    public Item updateQuantity(Integer id, Integer quantity) ;

    public void deleteItem(Integer id);
}
