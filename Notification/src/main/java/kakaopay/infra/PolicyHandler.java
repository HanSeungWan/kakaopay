package kakaopay.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import kakaopay.config.kafka.KafkaProcessor;
import kakaopay.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationRepository notificationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SettlementIncomplete'"
    )
    public void wheneverSettlementIncomplete_NotificationSend(
        @Payload SettlementIncomplete settlementIncomplete
    ) {
        SettlementIncomplete event = settlementIncomplete;
        System.out.println(
            "\n\n##### listener NotificationSend : " +
            settlementIncomplete +
            "\n\n"
        );

        // Sample Logic //
        Notification.notificationSend(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SettlementCompleted'"
    )
    public void wheneverSettlementCompleted_NotificationSend(
        @Payload SettlementCompleted settlementCompleted
    ) {
        SettlementCompleted event = settlementCompleted;
        System.out.println(
            "\n\n##### listener NotificationSend : " +
            settlementCompleted +
            "\n\n"
        );

        // Sample Logic //
        Notification.notificationSend(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
