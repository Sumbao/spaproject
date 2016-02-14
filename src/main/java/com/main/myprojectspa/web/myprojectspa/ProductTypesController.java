package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.ProductTypes;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/producttypeses")
@Controller
@RooWebScaffold(path = "producttypeses", formBackingObject = ProductTypes.class)
@RooWebJson(jsonObject = ProductTypes.class)
public class ProductTypesController {
}
