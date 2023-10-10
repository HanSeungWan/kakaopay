package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RemittanceSuccessful extends AbstractEvent {

    private Long id;

    public RemittanceSuccessful(RemittanceManagement aggregate) {
        super(aggregate);
    }

    public RemittanceSuccessful() {
        super();
    }
}
//>>> DDD / Domain Event
