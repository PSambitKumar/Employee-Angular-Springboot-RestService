package com.sambit.Controller;

import com.sambit.Entity.Employee;
import com.sambit.Exception.ResourceNotFoundException;
import com.sambit.Helper.Response;
import com.sambit.Repository.EmployeeRepository;
import com.sambit.Util.UserCodeGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
@RequestMapping("/myApi/v1")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @ResponseBody
    @GetMapping("/getAllEmployeeDetails")
    public List<Employee> getAllEmployee(){
        logger.info("<<-------Inside Get All Employee------->>" );
        return employeeRepository.findAll();
    }

//    @PostMapping(value = "/createEmployee")
//    public ResponseEntity<Response> createEmployee(@RequestBody Employee employee, Response response){
//        System.out.println(employee);
//        int maxEmpId = 0;
//        String userCode = null;
//        String result = null;
//        try {
//            maxEmpId = employeeRepository.maxSlno();
//            userCode= UserCodeGeneration.UserCodeGenreationMethod(maxEmpId + 1);
//        }catch (Exception e){
//            maxEmpId = 1;
//            userCode= UserCodeGeneration.UserCodeGenreationMethod(maxEmpId);
//        }
//        employee.setEmpUniqueCode(userCode);
//        employee.setEmpActive(true);
//        employee.setEmpType("USER");
//        employee.setEmpLock('N');
//        Employee saveEmployee = employeeRepository.save(employee);
//        if (saveEmployee == employee){
//            response.setStatus("success");
//        }else {
//            response.setStatus("fail");
//        }
//        return ResponseEntity.ok(response);
//    }

    @GetMapping(value = "/createEmployee")
    public String createEmployee(@RequestParam("empName")String empName,
                                 @RequestParam("empEmail")String empEmail){
        System.out.println("Inside Create Farmer Method.");
        System.out.println("Data : " + empName + empEmail);
        return null;
    }

    @GetMapping(value = "/getEmployeeById/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId")int empId){
        System.out.println("Employee ID is : " + empId);
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found With this Given EmpId" + empId));
        return ResponseEntity.ok(employee);
    }

    @GetMapping(value = "/updateEmployee/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("empId")int empId, @RequestBody Employee employee){
        Employee updateEmployee = new Employee();
        return ResponseEntity.ok(updateEmployee);
    }

    @GetMapping(value = "/deleteEmployeeById/{empId}")
    public ResponseEntity<Response> deleteEmpoyeeById(@PathVariable("empId")int empId, Response response){
        System.out.println(empId);
        Employee employee = null;
        employeeRepository.deleteById(empId);
        response.setStatus("Deleted");
        return ResponseEntity.ok(response);
    }

}
