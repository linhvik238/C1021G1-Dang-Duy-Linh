package com.example.controller;

import com.example.model.person.Employee;
import com.example.model.person.EmployeeDto;
import com.example.service.IEmployeeDivisionService;
import com.example.service.IEmployeeEducationDegreeService;
import com.example.service.IEmployeePositionService;
import com.example.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IEmployeeDivisionService employeeDivisionService;

    @Autowired
    private IEmployeePositionService employeePositionService;

    @Autowired
    private IEmployeeEducationDegreeService employeeEducationDegreeService;

    @GetMapping("/employee/list")
    public ModelAndView findAll(@PageableDefault (size = 3)Pageable pageable) {
        return new ModelAndView("employee/list", "employeeList", employeeService.employeeList(pageable));
    }

    @GetMapping ("/create-employee")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employee", new EmployeeDto());
        modelAndView.addObject("employeeDivision", employeeDivisionService.findAll());
        modelAndView.addObject("employeeEducation", employeeEducationDegreeService.findAll());
        modelAndView.addObject("employeePosition", employeePositionService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public String create(@Valid @ModelAttribute("employee") EmployeeDto employeeDto, BindingResult bindingResult, Model model){
        new EmployeeDto().validate(employeeDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("employeeDivision", employeeDivisionService.findAll());
            model.addAttribute("employeeEducation", employeeEducationDegreeService.findAll());
            model.addAttribute("employeePosition", employeePositionService.findAll());
            return "employee/create";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employeeService.save(employee);
        }
        return "redirect:/employee/list";
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable Long id, Model model,Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("employee/edit");
//        model.addAttribute("employeeDto",employeeService.findById(id));
        model.addAttribute("employeeDivision", employeeDivisionService.findAll());
        model.addAttribute("employeeEducation", employeeEducationDegreeService.findAll());
        model.addAttribute("employeePosition", employeePositionService.findAll());
        Employee employee = employeeService.findById(id).get();
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee, employeeDto);
        model.addAttribute("employeeDto", employeeDto);
        return modelAndView;
    }

    @PostMapping ("/edit-employee")
    public String edit(@Valid @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult, Model model) {
        new EmployeeDto().validate(employeeDto, bindingResult);
        if(bindingResult.hasErrors()) {
            model.addAttribute("employeeDivision", employeeDivisionService.findAll());
            model.addAttribute("employeeEducation", employeeEducationDegreeService.findAll());
            model.addAttribute("employeePosition", employeePositionService.findAll());
            return "/employee/edit";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employee.setEmployeeId(employeeDto.getEmployeeId());
            employeeService.save(employee);
        }
        return "redirect:/employee/list";
    }

    @GetMapping("/delete-employee")
    public String delete(Employee employee, @RequestParam Long id){
        Optional<Employee> employeeOptional = employeeService.findById(id);
        employeeService.deleteEmployee(employeeOptional.get());
        return "redirect:/employee/list";
    }
}
