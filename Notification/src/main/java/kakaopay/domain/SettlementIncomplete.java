package kakaopay.domain;

import java.util.*;
import kakaopay.domain.*;
import kakaopay.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class SettlementIncomplete extends AbstractEvent {

    private Long id;
}
