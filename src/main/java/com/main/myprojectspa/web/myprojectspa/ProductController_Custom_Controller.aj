package com.main.myprojectspa.web.myprojectspa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by zazabi37 on 25/02/2016.
 */
privileged aspect ProductController_Custom_Controller {
    @RequestMapping(value = "/productall", produces = "text/html")
    public String ProductController.productall(Model uiModel) {
        return "products/productall";
    }

    @RequestMapping(value = "/productdetail", produces = "text/html")
    public String ProductController.productdetail(Model uiModel) {
        return "products/productdetail";
    }
}




