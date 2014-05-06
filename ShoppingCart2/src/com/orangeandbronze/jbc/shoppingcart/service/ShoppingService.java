package com.orangeandbronze.jbc.shoppingcart.service;

import java.math.BigDecimal;
import java.util.List;

import com.orangeandbronze.jbc.shoppingcart.model.CartProduct;
import com.orangeandbronze.jbc.shoppingcart.model.InventoryProduct;

public interface ShoppingService {
	List<InventoryProduct> getInventory();
	List<CartProduct> getCart();
	void buy(int productNo, int quantity) throws ShoppingServiceException;
	boolean isInventoryEmpty();
	boolean isCartEmpty();
	void updateDatabase();
	BigDecimal getCartGrandTotal();
}
