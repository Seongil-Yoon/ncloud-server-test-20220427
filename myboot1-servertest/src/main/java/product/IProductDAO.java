package product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IProductDAO {
	public List<ProductDTO> productlist();

	public ProductDTO product(int productcode);

}
