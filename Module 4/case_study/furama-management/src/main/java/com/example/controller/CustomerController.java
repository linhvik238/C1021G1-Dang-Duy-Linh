package com.example.controller;

import com.example.model.person.Customer;
import com.example.model.person.CustomerDto;
import com.example.service.ICustomerService;
import com.example.service.impl.ICustomerTypeService;
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
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping ("/customer/list")
    public ModelAndView findAll(@PageableDefault (size = 3) Pageable pageable) {
        return new ModelAndView ("customer/list", "customerList", customerService.customerList(pageable));
    }

    @GetMapping ("/create-customer")
    public ModelAndView showCreateForm () {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new CustomerDto());
        modelAndView.addObject("customerType", customerTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public String create(@Valid @ModelAttribute("customer") CustomerDto customerDto , BindingResult bindingResult, Model model){
       new CustomerDto().validate(customerDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",customerTypeService.findAll());
            return "customer/create";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.save(customer);
        }
        return "redirect:/customer/list";
    }
    @GetMapping({"/home", "/"})
    public String home() {
        return "customer/promotion";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id, Model model, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        model.addAttribute("customerType",customerTypeService.findAll());
        Optional<Customer> customer = customerService.findById(id);
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customerDto,customer);
        model.addAttribute("customerDto", customer);
        return modelAndView;
    }

    @PostMapping ("/edit-customer")
    public String edit(@Valid @ModelAttribute CustomerDto customerDto , BindingResult bindingResult, Model model) {
        new CustomerDto().validate(customerDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",customerTypeService.findAll());
            return "/customer/edit";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customer.setIdCustomer(customerDto.getIdCustomer());
            customerService.save(customer);
        }
        return "redirect:/customer/list";
    }

    @GetMapping ("/delete-customer")
    public String delete(Customer customer, @RequestParam Long id) {
        Optional<Customer> customerOptional = customerService.findById(id);
        customerService.deleteCustomer(customerOptional.get());
        return "redirect:/customer/list";
    }
}
