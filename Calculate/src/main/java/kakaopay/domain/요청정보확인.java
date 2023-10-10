package kakaopay.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "요청정보확인_table")
@Data
public class 요청정보확인 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
