package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Information;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/informations")
@Controller
@RooWebScaffold(path = "informations", formBackingObject = Information.class)
@RooWebJson(jsonObject = Information.class)
public class InformationController {
    private Logger LOGGER = LoggerFactory.getLogger(InformationController.class);
}
