package ru.childrenofcorn.cornoffice;

import java.util.*;
import org.springframework.stereotype.Service;
import ru.childrenofcorn.modules.Sensor;
import ru.childrenofcorn.modules.TemperatureSensor;

@Service
public class ModulesService {

    private HashMap<String, Sensor> modules = new HashMap<String, Sensor>();

    public ModulesService() {
        modules.put("temperaturesensor", new TemperatureSensor());
    }

    public Sensor getSensor(String sensorName) {
        return modules.get(sensorName);
    }

}
