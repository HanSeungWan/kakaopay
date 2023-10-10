package kakaopay.infra;

import kakaopay.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SettlementHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SettlementHistory>> {

    @Override
    public EntityModel<SettlementHistory> process(
        EntityModel<SettlementHistory> model
    ) {
        return model;
    }
}
