package kakaopay.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import kakaopay.config.kafka.KafkaProcessor;
import kakaopay.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class 요청받은정보확인ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 요청받은정보확인Repository 요청받은정보확인Repository;
    //>>> DDD / CQRS
}
