package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.MassageTypes;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/massagetypeses")
@Controller
@RooWebScaffold(path = "massagetypeses", formBackingObject = MassageTypes.class)
@RooWebJson(jsonObject = MassageTypes.class)
public class MassageTypesController {
}
