package miu.edu.order.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipping {
    private Long shippingId;
    private Long orderId;
    private ShippingStatus status;
}
