package app.finance.api.controller;

import app.finance.infrastructure.database.CoinRepository;
import app.finance.infrastructure.database.entity.CoinEntity;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
@AllArgsConstructor
public class ManageCoinWalletController {

    public static final String MANAGE_COIN_WALLET = "/manage_coin_wallet";
    public static final String ADD_COIN = "/add_coin";

    private final CoinRepository coinRepository;

    @GetMapping(value = MANAGE_COIN_WALLET)
    public String managePanelWalletCoin(Model model) {
        model.addAttribute("coin", new CoinEntity());
        return "manage_panel_coin_wallet";
    }

    @PostMapping(value = ADD_COIN)
    public String addCoin(
            @Valid @ModelAttribute("coin") CoinEntity coinEntity
    ) {
        BigDecimal quantity = coinEntity.getQuantity().setScale(20, RoundingMode.HALF_DOWN);
        BigDecimal totalValueInFiat = coinEntity.getValueInFiat().setScale(20, RoundingMode.HALF_DOWN);
        coinEntity.setQuantity(quantity);
        coinEntity.setValueInFiat(totalValueInFiat);

        coinRepository.saveCoin(coinEntity);
        return "redirect:/manage_coin_wallet";
    }
}
