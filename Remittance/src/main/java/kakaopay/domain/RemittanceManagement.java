package kakaopay.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kakaopay.RemittanceApplication;
import lombok.Data;

@Entity
@Table(name = "RemittanceManagement_table")
@Data
//<<< DDD / Aggregate Root
public class RemittanceManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static RemittanceManagementRepository repository() {
        RemittanceManagementRepository remittanceManagementRepository = RemittanceApplication.applicationContext.getBean(
            RemittanceManagementRepository.class
        );
        return remittanceManagementRepository;
    }
}
//>>> DDD / Aggregate Root
