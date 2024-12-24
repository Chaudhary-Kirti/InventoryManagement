package com.inventory.InventoryManagement.services;

import com.inventory.InventoryManagement.entities.Item;
import com.inventory.InventoryManagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

   // private List<Item> list = new ArrayList<>();
    @Autowired
    ItemRepository itemRepository;

    public Item addItem(Item item){
        Item savedItem  = itemRepository.save(item);
        return savedItem;
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item getItemById(int id){
        return itemRepository.findById(id).orElse(null);
    }

    public Item updateItem(int id, Item updatedItem) {
        return itemRepository.findById(id)
                .map(item -> {
                    item.setName(updatedItem.getName());
                    item.setQuantity(updatedItem.getQuantity());
                    item.setDescription(updatedItem.getDescription());
                    item.setPrice(updatedItem.getPrice());
                    return itemRepository.save(item);
                })
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    public void deleteItem(int id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
        } else {
            throw new RuntimeException("Item not found with id: " + id);
        }
    }

}
