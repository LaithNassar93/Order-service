package miu.edu.order.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long paymentID;
    public PaymentType paymentType;
    private Long userID;
    private String cardId;

}
