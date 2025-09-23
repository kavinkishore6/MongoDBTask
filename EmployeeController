package com.example.mongodbTask.controller;

import com.example.mongodbTask.model.Employee;
import com.example.mongodbTask.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Show form
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Add Employee
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee, Model model) {
        Employee saved = service.saveEmployee(employee);
        model.addAttribute("employee", saved);
        return "displayOne";
    }

    // Show All Employees
    @GetMapping("/displayAll")
    public String displayAll(Model model) {
        List<Employee> employees = service.getAllEmployees();
        model.addAttribute("employees", employees);
        return "displayAll";
    }
}
