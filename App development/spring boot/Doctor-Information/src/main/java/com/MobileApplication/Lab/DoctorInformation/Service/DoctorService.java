package com.MobileApplication.Lab.DoctorInformation.Service;

import com.MobileApplication.Lab.DoctorInformation.Entity.Doctor;
import com.MobileApplication.Lab.DoctorInformation.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;
    public Doctor saveProduct(Doctor doctor) {
        return repository.save(doctor);

    }
    //create a list of product
    public List<Doctor> saveProducts(List<Doctor> doctors) {
        return repository.saveAll(doctors);

    }
    public Doctor getdoctor(int id) {
        return repository.findById(id).orElse(null);

    }
    public Doctor getdoctorName(String name) {
        return repository.findByName(name);

    }
    //find a list of product
    public List<Doctor> getdoctors() {
        return repository.findAll();
    }


}
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Doctor removed with id" +id;

    }
    //update mathod
//    public Product updateProduct(int id,Product product){
//        Product data= repository.findById(id).orElse(null);
//        data.setName(product.getName());
//        data.setQuantity(product.getQuantity());
//        data.setPrice(product.getPrice());
//        return repository.save(data);
//    }
