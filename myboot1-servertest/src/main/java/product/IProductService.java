package product;

import java.util.List;

public interface IProductService {
	public List<ProductDTO> productlist();

	public ProductDTO product(int productcode);
}
