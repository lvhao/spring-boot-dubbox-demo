import com.alibaba.dubbo.config.annotation.Reference;
import com.github.springbootdubboxdemo.api.service.OrderService;

import org.junit.Test;

/**
 * 功能简单描述
 *
 * @author: lvhao
 * @since: 2016-10-13 20:40
 */
public class TestRemoteOrderService extends TestBase {

    @Reference
    private OrderService orderService;

    @Test
    public void queryUserOrders(){
        orderService.queryUserOrders(1000L).stream().forEach(System.out::println);
    }

}
