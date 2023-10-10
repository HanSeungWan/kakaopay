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
    SettlementHistoryRepository settlementHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RemittanceSuccessful'"
    )
    public void wheneverRemittanceSuccessful_ChangeSettlementStatus(
        @Payload RemittanceSuccessful remittanceSuccessful
    ) {
        RemittanceSuccessful event = remittanceSuccessful;
        System.out.println(
            "\n\n##### listener ChangeSettlementStatus : " +
            remittanceSuccessful +
            "\n\n"
        );

        // Sample Logic //
        SettlementHistory.changeSettlementStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TransferFailed'"
    )
    public void wheneverTransferFailed_ChangeSettlementStatus(
        @Payload TransferFailed transferFailed
    ) {
        TransferFailed event = transferFailed;
        System.out.println(
            "\n\n##### listener ChangeSettlementStatus : " +
            transferFailed +
            "\n\n"
        );

        // Sample Logic //
        SettlementHistory.changeSettlementStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
