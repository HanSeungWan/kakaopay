package kakaopay.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Calculate", url = "${api.url.Calculate}")
public interface SettlementHistoryService {
    @RequestMapping(method = RequestMethod.POST, path = "/settlementHistories")
    public void startSettlement(
        @RequestBody SettlementHistory settlementHistory
    );
}
