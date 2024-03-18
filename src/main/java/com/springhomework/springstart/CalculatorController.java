package com.springhomework.springstart;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @ResponseBody
    @RequestMapping("")
    public String showMessage() {
        return service.showMessage();
    }

    @ResponseBody
    @RequestMapping("/add")
    public String add(@RequestParam(value = "first", required = false) Double value1, @RequestParam(value = "second", required = false) Double value2) {
        return service.add(value1, value2);
    }

    @ResponseBody
    @RequestMapping("/subtract")
    public String subtract(@RequestParam(value = "first", required = false) Double value1, @RequestParam(value = "second", required = false) Double value2) {
        return service.subtract(value1, value2);
    }

    @ResponseBody
    @RequestMapping("/multiply")
    public String multiply(@RequestParam(value = "first", required = false) Double value1, @RequestParam(value = "second", required = false) Double value2) {
        return service.multiply(value1, value2);
    }

    @ResponseBody
    @RequestMapping("/divide")
    public String divide(@RequestParam(value = "first", required = false) Double value1, @RequestParam(value = "second", required = false) Double value2) {
        return service.divide(value1, value2);
    }
}
