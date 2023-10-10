package kakaopay.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kakaopay.CalculateApplication;
import lombok.Data;

@Entity
@Table(name = "SettlementHistory_table")
@Data
//<<< DDD / Aggregate Root
public class SettlementHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static SettlementHistoryRepository repository() {
        SettlementHistoryRepository settlementHistoryRepository = CalculateApplication.applicationContext.getBean(
            SettlementHistoryRepository.class
        );
        return settlementHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeSettlementStatus(
        RemittanceSuccessful remittanceSuccessful
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        SettlementHistory settlementHistory = new SettlementHistory();
        repository().save(settlementHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(remittanceSuccessful.get???()).ifPresent(settlementHistory->{
            
            settlementHistory // do something
            repository().save(settlementHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeSettlementStatus(TransferFailed transferFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        SettlementHistory settlementHistory = new SettlementHistory();
        repository().save(settlementHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(transferFailed.get???()).ifPresent(settlementHistory->{
            
            settlementHistory // do something
            repository().save(settlementHistory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
