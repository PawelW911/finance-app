package app.finance.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "fiatId")
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fiat")
public class FiatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fiat_id")
    private Integer fiatId;

    @Column(name = "name")
    private String name;

    @Column(name = "price_in_other_fiat")
    private BigDecimal priceInOtherFiat;

    @Column(name = "quantity")
    private BigDecimal quantity;
}
