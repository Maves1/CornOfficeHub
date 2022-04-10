package ru.childrenofcorn.cornoffice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.childrenofcorn.modules.RealTemperatureSensor;
import ru.childrenofcorn.modules.TemperatureSensor;

public class ModulesService {

    TemperatureSensor sensor = new RealTemperatureSensor();

    @RequestMapping("/get_module/{module}")
    public float getModuleData(@PathVariable String module) {
        return sensor.getCurrentTemperature();
    }
}
