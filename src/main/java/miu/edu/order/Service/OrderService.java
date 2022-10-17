package miu.edu.order.Service;

import lombok.extern.slf4j.Slf4j;
import miu.edu.order.Domain.OrderItem;
import miu.edu.order.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    public void saveOrderItem(OrderItem orderItem) {
        log.info("I am Inside saveUser of UserService");
        orderRepository.save(orderItem);
    }

    public OrderItem findOrderItemById(Long orderId) {
        log.info("I am Inside findUser of UserService");
        return orderRepository.findOrderItemByOrderId(orderId);
    }

    public List<OrderItem> getAllOrderItem(){
        return orderRepository.findAll();

    }


}
