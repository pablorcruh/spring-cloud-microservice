package ec.com.pablorcruh.app.item.service;

import ec.com.pablorcruh.app.item.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();

    Item  findById(Long id, Integer cantidad);
}
