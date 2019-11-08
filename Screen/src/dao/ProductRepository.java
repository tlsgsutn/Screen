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
		
		Product cpu = new Product("P0002", "인텔® 코어™ i9-9900K 프로세서", 580000);
		cpu.setDescription("8 코어, 16 스레드, 3.60 GHz");
		cpu.setCategory("CPU");
		cpu.setManufacturer("Intel");
		cpu.setUnitsInStock(1000);
		cpu.setCondition("New");
		
		Product Graphics = new Product("P0003", "지포스 2080ti", 1250000);
		Graphics.setDescription("NVIDIA제품 시리즈	지포스 RTX 20, GPU 제조 공정	12nm, NVIDIA 칩셋	RTX 2080 Ti,코어 클럭 부스트 1755MHz,	쿠다 프로세서 4352개, 인터페이스 PCIe3.0x16");
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
