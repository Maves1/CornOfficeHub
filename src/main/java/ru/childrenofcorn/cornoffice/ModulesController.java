package ru.childrenofcorn.cornoffice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.childrenofcorn.modules.TemperatureSensor;
import org.springframework.web.bind.annotation.*;
import ru.childrenofcorn.modules.Sensor;

@RestController
public class ModulesController {

    @Autowired
    private ModulesService modulesService;

    @RequestMapping("/get_module/{module}")
    public Sensor getModuleData(@PathVariable String module) {
        return modulesService.getSensor(module);
    }
}
