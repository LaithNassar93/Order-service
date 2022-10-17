package miu.edu.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "payment-service")
public interface PaymentClient {
    @RequestMapping(method = RequestMethod.GET, value = "/balance/user/{userId}/amount/{amount}")
    public boolean checkBalance(@PathVariable Long userId,@PathVariable Double amount);

}
