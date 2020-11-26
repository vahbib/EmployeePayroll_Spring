package com.spring.employeepayrollapp.controller;

import com.spring.employeepayrollapp.dto.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
    @GetMapping("/")
    public ResponseEntity<String> getEmployeeData() {
        return new ResponseEntity<String>("Get Response from server", HttpStatus.OK);

    }
    @GetMapping("/getid/{id}")
    public ResponseEntity<String> getEmployeeId(@PathVariable (value = "id") int empId) {
        return new ResponseEntity<String>( "Get Response from server: "+empId, HttpStatus.OK );
    }
    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity<String>("Get the Response from post request: "+employeeDTO.toString(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String > updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity<String>("Get Response from put server: "+employeeDTO.toString(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String > deleteEmployee(@PathVariable (value = "id") int empId) {
       return  new ResponseEntity<String>("Get Response from delete server: "+empId, HttpStatus.OK);
    }

}
