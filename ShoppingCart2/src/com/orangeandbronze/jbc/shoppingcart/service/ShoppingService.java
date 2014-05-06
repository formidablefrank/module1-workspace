package com.orangeandbronze.jbc.shoppingcart.service;

import java.math.BigDecimal;
import java.util.List;

import com.orangeandbronze.jbc.shoppingcart.dao.ShoppingDaoException;
import com.orangeandbronze.jbc.shoppingcart.model.CartProduct;
import com.orangeandbronze.jbc.shoppingcart.model.InventoryProduct;

public interface ShoppingService {
	List<InventoryProduct> getInventory() throws ShoppingDaoException;
	List<CartProduct> getCart() throws ShoppingDaoException;
	void buy(int productNo, int quantity) throws ShoppingServiceException;
	boolean isInventoryEmpty();
	boolean isCartEmpty();
	void updateDatabase();
	BigDecimal getCartGrandTotal();
}
