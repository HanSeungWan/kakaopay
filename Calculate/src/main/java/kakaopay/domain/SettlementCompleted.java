package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SettlementCompleted extends AbstractEvent {

    private Long id;

    public SettlementCompleted(SettlementHistory aggregate) {
        super(aggregate);
    }

    public SettlementCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
