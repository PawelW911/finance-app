package app.finance.api.controller;

import app.finance.bussiness.dao.UserAppDAO;
import app.finance.infrastructure.database.UserAppRepository;
import app.finance.infrastructure.database.entity.UserAppEntity;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class CreateAccountController {

    public static final String CREATE_ACCOUNT = "/create_account";
    public static final String SUBMIT_USER_ACCOUNT = "/submit_user_account";

    private final UserAppDAO userAppDAO;

    @GetMapping(value = CREATE_ACCOUNT)
    public String createAccountPage(Model model) {
        model.addAttribute("userAppEntity", new UserAppEntity());
        return "create_user_account";
    }

    @PostMapping(value = SUBMIT_USER_ACCOUNT)
    public String submitUserAccount(
            @Valid @ModelAttribute("userAppEntity") UserAppEntity userAppEntity
    ) {
        userAppDAO.saveUserAccount(userAppEntity);
        return "create_user_account_success";
    }
}
