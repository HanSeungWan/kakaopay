package kakaopay.domain;

import kakaopay.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="remittanceManagements", path="remittanceManagements")
public interface RemittanceManagementRepository extends PagingAndSortingRepository<RemittanceManagement, >{
}