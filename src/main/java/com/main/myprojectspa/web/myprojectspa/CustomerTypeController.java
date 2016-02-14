package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.CustomerType;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/customertypes")
@Controller
@RooWebScaffold(path = "customertypes", formBackingObject = CustomerType.class)
@RooWebJson(jsonObject = CustomerType.class)
public class CustomerTypeController {
}
