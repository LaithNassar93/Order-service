package miu.edu.order.Repository;

import miu.edu.order.Domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderItem, Long> {

    OrderItem findOrderItemByOrderId(Long orderId);

}
