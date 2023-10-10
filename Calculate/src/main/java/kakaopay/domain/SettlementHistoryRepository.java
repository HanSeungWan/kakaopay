package kakaopay.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import kakaopay.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="settlementHistories", path="settlementHistories")
public interface SettlementHistoryRepository extends PagingAndSortingRepository<SettlementHistory, >{
}