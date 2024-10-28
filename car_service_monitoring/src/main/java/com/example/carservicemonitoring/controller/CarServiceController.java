package com.example.carservicemonitoring.controller; // Ensure it's in a subpackage

import com.example.carservicemonitoring.service.CarServiceService;
import com.example.carservicemonitoring.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/carservice")
public class CarServiceController {

    @Autowired
    private CarServiceService carServiceService;

    @GetMapping
    public String getAllCarServices(Model model) {
        List<CarService> carServices = carServiceService.getAllCarServices();
        model.addAttribute("carServices", carServices);
        return "carservice_list";
    }

    @GetMapping("/add")
    public String showAddCarServiceForm(Model model) {
        model.addAttribute("carService", new CarService());
        return "add_carservice";
    }

    @PostMapping("/add")
    public String createCarService(@ModelAttribute("carService") CarService carService) {
        carServiceService.saveCarService(carService);
        return "redirect:/carservice";
    }

    @GetMapping("/delete/{id}")
    public String deleteCarService(@PathVariable Long id) {
        carServiceService.deleteCarService(id);
        return "redirect:/carservice";
    }
}
