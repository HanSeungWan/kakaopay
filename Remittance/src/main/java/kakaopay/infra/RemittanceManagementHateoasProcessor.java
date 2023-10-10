package kakaopay.infra;

import kakaopay.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RemittanceManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RemittanceManagement>> {

    @Override
    public EntityModel<RemittanceManagement> process(
        EntityModel<RemittanceManagement> model
    ) {
        return model;
    }
}
