package miu.edu.order.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany
    private List<Product> productList;
    private Double totalAmount;
    private String address;
    private Long userId;
    private String payment;

//    public Long orderId;
//    public Long product;
//    public Long amount;
//    public String address;
//    public Long user;
//    public String payment;

}
