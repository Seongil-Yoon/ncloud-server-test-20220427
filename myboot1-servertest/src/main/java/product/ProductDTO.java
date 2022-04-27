package product;

import org.springframework.stereotype.Component;

@Component
public class ProductDTO {
	private int productcode;
	private String productname;
	private int price;
	private String company;
	private int balance;
	private String regdate;

	public ProductDTO() {
		super();
	}

	public ProductDTO(int productcode, String productname, int price, String company, int balance, String regdate) {
		super();
		this.productcode = productcode;
		this.productname = productname;
		this.price = price;
		this.company = company;
		this.balance = balance;
		this.regdate = regdate;
	}

	public int getProductcode() {
		return productcode;
	}

	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ProductDTO [productcode=" + productcode + ", productname=" + productname + ", price=" + price
				+ ", company=" + company + ", balance=" + balance + ", regdate=" + regdate + "]";
	}

}
