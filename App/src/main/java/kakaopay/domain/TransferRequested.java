package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TransferRequested extends AbstractEvent {

    private Long id;

    public TransferRequested(Customer aggregate) {
        super(aggregate);
    }

    public TransferRequested() {
        super();
    }
}
//>>> DDD / Domain Event
