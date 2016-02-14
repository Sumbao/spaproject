package com.main.myprojectspa.web.myprojectspa;
import com.main.myprojectspa.domain.projectspa.Employee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/employees")
@Controller
@RooWebScaffold(path = "employees", formBackingObject = Employee.class)
@RooWebJson(jsonObject = Employee.class)
public class EmployeeController {
}
