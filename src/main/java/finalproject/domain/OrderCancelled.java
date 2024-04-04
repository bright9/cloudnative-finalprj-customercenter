package finalproject.domain;

import finalproject.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private String status;
    private String address;
}
