package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TransferFailed extends AbstractEvent {

    private Long id;

    public TransferFailed(RemittanceManagement aggregate) {
        super(aggregate);
    }

    public TransferFailed() {
        super();
    }
}
//>>> DDD / Domain Event
