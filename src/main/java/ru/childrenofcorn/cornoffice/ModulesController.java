package ru.childrenofcorn.cornoffice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.childrenofcorn.modules.RealTemperatureSensor;
import ru.childrenofcorn.modules.TemperatureSensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ModulesController {

    TemperatureSensor sensor = new RealTemperatureSensor();

    @RequestMapping("/get_module/{module}")
    public TemperatureSensor getModuleData(@PathVariable String module) {
        return sensor;
    }
}
