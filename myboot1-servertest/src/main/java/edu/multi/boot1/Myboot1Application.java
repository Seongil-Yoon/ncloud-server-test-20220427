package edu.multi.boot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import product.IProductDAO;
import product.ProductController;
import spring.mybatis.IMemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadDTO;

@SpringBootApplication
@ComponentScan // 같은 패키지의 어노테이션 스캔
//해당 이름의 패키지를 스캔
//@ComponentScan(basePackages = {"upload","spring.mybatis"})
//해당 파일이 있는 패키지 모두 스캔
@ComponentScan(basePackageClasses = UploadDTO.class)
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@ComponentScan(basePackageClasses = ProductController.class)
@MapperScan(basePackageClasses = IMemberDAO.class)
@MapperScan(basePackageClasses = IProductDAO.class)
public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
	}

}
