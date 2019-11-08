package dao;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	public ProductRepository() {
		Product phone = new Product("P0001", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product cpu = new Product("P0002", "���ڢ� �ھ�� i9-9900K ���μ���", 580000);
		cpu.setDescription("8 �ھ�, 16 ������, 3.60 GHz");
		cpu.setCategory("CPU");
		cpu.setManufacturer("Intel");
		cpu.setUnitsInStock(1000);
		cpu.setCondition("New");
		
		Product Graphics = new Product("P0003", "������ 2080ti", 1250000);
		Graphics.setDescription("NVIDIA��ǰ �ø���	������ RTX 20, GPU ���� ����	12nm, NVIDIA Ĩ��	RTX 2080 Ti,�ھ� Ŭ�� �ν�Ʈ 1755MHz,	��� ���μ��� 4352��, �������̽� PCIe3.0x16");
		Graphics.setCategory("Graphics cade");
		Graphics.setManufacturer("GeForce");
		Graphics.setUnitsInStock(1000);
		Graphics.setCondition("New");
		
		listOfProducts.add(phone);
		listOfProducts.add(cpu);
		listOfProducts.add(Graphics);
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	public void addProduct (Product product) {
		listOfProducts.add(product);
	}
}
