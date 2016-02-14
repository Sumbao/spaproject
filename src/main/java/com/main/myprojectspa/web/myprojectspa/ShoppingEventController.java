package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.ShoppingEvent;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/shoppingevents")
@Controller
@RooWebScaffold(path = "shoppingevents", formBackingObject = ShoppingEvent.class)
@RooWebJson(jsonObject = ShoppingEvent.class)
public class ShoppingEventController {
}
