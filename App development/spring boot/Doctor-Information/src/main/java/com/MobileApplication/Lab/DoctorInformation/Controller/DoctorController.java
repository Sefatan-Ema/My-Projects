package com.MobileApplication.Lab.DoctorInformation.Controller;

import com.MobileApplication.Lab.DoctorInformation.Entity.Doctor;
import com.MobileApplication.Lab.DoctorInformation.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/d")

public class DoctorController {

    @Autowired
    private DoctorService service;
    @PostMapping("/addproduct")

    public Doctor addProduct(@RequestBody Doctor doctor) {
        return service.saveDoctor(doctor);
    }
    @PostMapping("/addproducts")

    public List<Doctor> addProducts(@RequestBody List<Doctor> doctors) {
        return service.saveDoctors(doctors);
    }
    @GetMapping("/finddoctorid/{id}")
    public Doctor findProductById(@PathVariable int id) {
        return service.getdoctor(id);
    }
    @GetMapping("/finddoctor/{name}")
    public Doctor findProductByName(@PathVariable String name) {
        return service.getdoctorName(name);
    }
    @GetMapping("/finddoctors")
    public List<Doctor> findAlldoctors() {
        return service.getdoctors();
    }



}
