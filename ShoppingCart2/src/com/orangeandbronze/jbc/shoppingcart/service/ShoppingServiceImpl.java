package com.orangeandbronze.jbc.shoppingcart.service;

import java.math.BigDecimal;
import java.util.List;

import com.orangeandbronze.jbc.shoppingcart.dao.ShoppingDao;
import com.orangeandbronze.jbc.shoppingcart.dao.ShoppingDaoException;
import com.orangeandbronze.jbc.shoppingcart.dao.ShoppingDaoImpl;
import com.orangeandbronze.jbc.shoppingcart.model.CartProduct;
import com.orangeandbronze.jbc.shoppingcart.model.InventoryProduct;

public class ShoppingServiceImpl implements ShoppingService {
	private ShoppingDao shoppingDao;

	public ShoppingServiceImpl() {
		shoppingDao = new ShoppingDaoImpl();
	}

	@Override
	public List<InventoryProduct> getInventory() throws ShoppingDaoException {
		return shoppingDao.getInventory();
	}

	@Override
	public List<CartProduct> getCart() throws ShoppingDaoException {
		return shoppingDao.getCart();
	}

	@Override
	public void buy(int productNo, int quantity)
			throws ShoppingServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isInventoryEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCartEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateDatabase() {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal getCartGrandTotal() {
		// TODO Auto-generated method stub
		return null;
	}

}
