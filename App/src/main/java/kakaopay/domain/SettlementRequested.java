package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SettlementRequested extends AbstractEvent {

    private Long id;

    public SettlementRequested(Customer aggregate) {
        super(aggregate);
    }

    public SettlementRequested() {
        super();
    }
}
//>>> DDD / Domain Event
