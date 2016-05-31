package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.MassageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/massageevents")
@Controller
@RooWebScaffold(path = "massageevents", formBackingObject = MassageEvent.class)
@RooWebJson(jsonObject = MassageEvent.class)
public class MassageEventController {
    private Logger LOGGER = LoggerFactory.getLogger(MassageEvent.class);
}
