package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/products")
@Controller
@RooWebScaffold(path = "products", formBackingObject = Product.class)
@RooWebJson(jsonObject = Product.class)
public class ProductController {
    private Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

}
