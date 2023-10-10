package kakaopay.domain;

import java.time.LocalDate;
import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class NotificationSent extends AbstractEvent {

    private Long id;

    public NotificationSent(Notification aggregate) {
        super(aggregate);
    }

    public NotificationSent() {
        super();
    }
}
//>>> DDD / Domain Event
