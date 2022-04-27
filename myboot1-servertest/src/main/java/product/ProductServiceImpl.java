package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductDAO dao;

	@Override
	public List<ProductDTO> productlist() {
		return dao.productlist();
	}

	@Override
	public ProductDTO product(int productcode) {
		return dao.product(productcode);
	}

}
