package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Holiday;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/holidays")
@Controller
@RooWebScaffold(path = "holidays", formBackingObject = Holiday.class)
@RooWebJson(jsonObject = Holiday.class)
public class HolidayController {
}
