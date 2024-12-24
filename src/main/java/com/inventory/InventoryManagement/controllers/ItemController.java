package com.inventory.InventoryManagement.controllers;

import com.inventory.InventoryManagement.entities.Item;
import com.inventory.InventoryManagement.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//return in json format
@RequestMapping("/items")
public class ItemController {

    @Autowired //injecting class using object
    ItemService itemService;

    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item updatedItem) {
        return itemService.updateItem(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
        return "Item with id " + id + " has been deleted.";
    }
}
