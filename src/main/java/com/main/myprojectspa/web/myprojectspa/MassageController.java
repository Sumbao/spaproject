package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Massage;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/massages")
@Controller
@RooWebScaffold(path = "massages", formBackingObject = Massage.class)
@RooWebJson(jsonObject = Massage.class)
public class MassageController {
}
