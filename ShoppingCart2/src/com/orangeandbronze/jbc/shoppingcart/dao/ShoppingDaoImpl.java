package com.orangeandbronze.jbc.shoppingcart.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.orangeandbronze.jbc.shoppingcart.model.CartProduct;
import com.orangeandbronze.jbc.shoppingcart.model.InventoryProduct;
import com.orangeandbronze.jbc.shoppingcart.model.Product;

public class ShoppingDaoImpl implements ShoppingDao {
	private final String CART_FILE = "resources/cart";
	private final String INVENTORY_FILE = "resources/inventory";

	@Override
	public void updateInventory(List<InventoryProduct> collection) throws ShoppingDaoException{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(INVENTORY_FILE))){
			for(InventoryProduct ip: collection){
				Product pro = ip.getProduct();
				String temp = String.format("%s\t%d\t%s", pro.getName(), ip.getQuantity(), pro.getPrice().toPlainString());
				writer.write(temp);
				writer.newLine();
			}
		} catch (IOException e){
			throw new ShoppingDaoException("ERROR: Writing file failed");
		}
	}
	
	@Override
	public List<InventoryProduct> getInventory() throws ShoppingDaoException{
		List<InventoryProduct> list = new ArrayList<InventoryProduct>();
		try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))){
			int productNo = 1;
			while(reader.ready()){
				String temp[] = reader.readLine().split("\\s+");
				Product newProduct = new Product(temp[0], productNo, "", new BigDecimal(temp[2]));
				InventoryProduct newInventoryProduct = new InventoryProduct(newProduct, Integer.parseInt(temp[1]));
				list.add(newInventoryProduct);
			}
		} catch(IOException e){
			throw new ShoppingDaoException("ERROR: Reading file failed");
		}
		return list;
	}

	@Override
	public List<CartProduct> getCart() throws ShoppingDaoException {
		List<CartProduct> list = new ArrayList<CartProduct>();
		try (BufferedReader reader = new BufferedReader(new FileReader(CART_FILE))){
			int productNo = 1;
			while(reader.ready()){
				String temp[] = reader.readLine().split("\\s+");
				Product newProduct = new Product(temp[0], productNo, "", new BigDecimal(temp[2]));
				CartProduct newCartProduct = new CartProduct(newProduct, Integer.parseInt(temp[1]));
				list.add(newCartProduct);
			}
		} catch(IOException e){
			throw new ShoppingDaoException("ERROR: Reading file failed");
		}
		return list;
	}

	@Override
	public void updateCart(List<CartProduct> collection)
			throws ShoppingDaoException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(CART_FILE))){
			for(CartProduct ip: collection){
				Product pro = ip.getProduct();
				String temp = String.format("%s\t%d\t%s", pro.getName(), ip.getQuantity(), pro.getPrice().toPlainString());
				writer.write(temp);
				writer.newLine();
			}
		} catch (IOException e){
			throw new ShoppingDaoException("ERROR: Writing file failed");
		}
	}
}
