package es.panicape.ecommercews;

import es.panicape.ecommercews.dto.PriceDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;


/**
 * HttpRequestTest
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    // Tests

    /**
     *
     * @throws Exception
     */
    @Test
    void getAllpricesWsTest() throws Exception {
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port + "/price/all",
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }

    /**
     * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     *
     * @throws Exception
     */
    @Test
    void test1() throws Exception {
        String date="2020-06-14-10.00.00";
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_handler/price/"+date+"/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }

    /**
     * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     *
     * @throws Exception
     */
    @Test
    void test2() throws Exception {
        String date="2020-06-14-16.00.00";
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_handler/price/"+date+"/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }

    /**
     * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     *
     * @throws Exception
     */
    @Test
    void test3() throws Exception {
        String date="2020-06-14-21.00.00";
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_handler/price/"+date+"/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }

    /**
     * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
     *
     * @throws Exception
     */
    @Test
    void test4() throws Exception {
        String date="2020-06-15-10.00.00";
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_handler/price/"+date+"/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }

    /**
     * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
     * @throws Exception
     */
    @Test
    void test5() throws Exception {
        String date="2020-06-16-21.00.00";
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_handler/price/"+date+"/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }


    /**
     *
     * @throws Exception
     */
    @Test
    void testBase() throws Exception {
        int prodId=35455;
        int brandId=1;
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + port
                        + "/price_manager/price/" + prodId + "/" + brandId,
                PriceDTO.class)).isInstanceOf(PriceDTO.class);
    }




}
