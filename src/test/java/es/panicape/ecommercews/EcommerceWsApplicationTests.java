package es.panicape.ecommercews;

import es.panicape.ecommercews.persistence.IPriceRepository;
import es.panicape.ecommercews.persistence.IProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * HttpRequestTest
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@SpringBootTest
class EcommerceWsApplicationTests {

	/** IProductRepository */
	@MockBean
	private IProductRepository productRepo;

	/** IProductRepository */
	@MockBean
	private IPriceRepository priceRepo;


	// Tests

	/**
	 * contextLoads
	 */
	@Test
	void contextLoads() {
	}

	/**
	 * Test testGetProduct
	 *
	 * @throws Exception any error exception
	 */
	@Test
	public void testGetProduct() throws Exception {
		Assertions.assertFalse(productRepo.findAll().iterator().hasNext());
	}

	/**
	 * testGetAllPrice
	 *
	 * @throws Exception any error exception
	 */
	@Test
	public void testGetAllPrice() throws Exception {
		Assertions.assertFalse(priceRepo.findAll().iterator().hasNext());
	}

	/**
	 * testGetPriceByProductAndBrandId
	 *
	 * @throws Exception any error exception
	 */
	@Test
	public void testGetPriceByProductAndBrandId() throws Exception {
		int prodId=35455;
		int brandId=1;
        Assertions.assertTrue(priceRepo.findPriceByProdIdAndBrandId(prodId, brandId).isEmpty());
	}

}
