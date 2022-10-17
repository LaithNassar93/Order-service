package miu.edu.order.Controller;
import lombok.extern.slf4j.Slf4j;
import miu.edu.order.Domain.OrderItem;
import miu.edu.order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock/orders")
@Slf4j
public class OrderItemController {
    @Autowired
    OrderService orderService;

    @GetMapping()
    public List<OrderItem> getAllUsers(){
        return orderService.getAllOrderItem();
    }

    @PostMapping("/add")
    public void createUser(@RequestBody OrderItem orderItem){
        log.info("Inside createUser of UserController");
        orderService.saveOrderItem(orderItem);
    }

    @GetMapping("/{id}")
    public OrderItem findOrderItemById(@PathVariable("id") Long orderId){
        log.info("Inside findUser of UserController");
        return orderService.findOrderItemById(orderId);
    }
}
