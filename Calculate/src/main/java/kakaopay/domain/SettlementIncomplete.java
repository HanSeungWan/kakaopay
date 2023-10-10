package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SettlementIncomplete extends AbstractEvent {

    private Long id;

    public SettlementIncomplete(SettlementHistory aggregate) {
        super(aggregate);
    }

    public SettlementIncomplete() {
        super();
    }
}
//>>> DDD / Domain Event
