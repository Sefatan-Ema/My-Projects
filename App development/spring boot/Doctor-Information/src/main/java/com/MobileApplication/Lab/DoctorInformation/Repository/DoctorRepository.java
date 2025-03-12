package com.MobileApplication.Lab.DoctorInformation.Repository;

import com.MobileApplication.Lab.DoctorInformation.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
        Doctor findByName(String name);

}
