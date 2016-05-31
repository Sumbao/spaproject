package com.main.myprojectspa.web.myprojectspa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by zazabi37 on 25/02/2016.
 */
privileged aspect MassageController_Custom_Controller {
    @RequestMapping(value = "/massageall", produces = "text/html")
    public String MassageController.massageall(Model uiModel) {
        return "massages/massageall";
    }

    @RequestMapping(value = "/beautyall", produces = "text/html")
    public String MassageController.beautyall(Model uiModel) {
        return "massages/beautyall";
    }

    @RequestMapping(value = "/massageeventlist", produces = "text/html")
    public String MassageController.massageeventlist(Model uiModel) {
        return "massages/massageeventlist";
    }

}
