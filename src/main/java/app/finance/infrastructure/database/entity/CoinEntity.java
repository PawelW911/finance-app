package app.finance.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "coinId")
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coin")
public class CoinEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coin")
    private Integer coinId;

    @Column(name = "name")
    private String name;

    @Column(name = "address_token_id")
    private String addressTokenID;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "value_in_fiat")
    private BigDecimal valueInFiat;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_app_id")
    private UserAppEntity userAppEntity;
}
