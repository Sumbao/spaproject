package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Customer;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/customers")
@Controller
@RooWebScaffold(path = "customers", formBackingObject = Customer.class)
@RooWebJson(jsonObject = Customer.class)
public class CustomerController {
}
