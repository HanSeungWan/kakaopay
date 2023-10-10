package kakaopay.infra;

import java.util.List;
import kakaopay.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "요청받은정보확인",
    path = "요청받은정보확인"
)
public interface 요청받은정보확인Repository
    extends PagingAndSortingRepository<요청받은정보확인, Long> {}
