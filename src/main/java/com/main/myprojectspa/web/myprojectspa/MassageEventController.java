package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.MassageEvent;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/massageevents")
@Controller
@RooWebScaffold(path = "massageevents", formBackingObject = MassageEvent.class)
@RooWebJson(jsonObject = MassageEvent.class)
public class MassageEventController {
}
