package app.finance.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ViewAccountController {

    public static final String VIEW_ACCOUNT = "/view_account";

    @GetMapping(value = VIEW_ACCOUNT)
    public String viewAccountPage() {
        return "viewPage";
    }
}
