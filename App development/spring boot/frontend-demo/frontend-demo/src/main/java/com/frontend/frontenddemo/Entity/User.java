package com.frontend.frontenddemo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int u_id;
    @Column
    private String u_name;
    @Column
    private double U_email;

    public User() {
    }

    public User(int u_id, String u_name, double u_email) {
        this.u_id = u_id;
        this.u_name = u_name;
        U_email = u_email;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public double getU_email() {
        return U_email;
    }

    public void setU_email(double u_email) {
        U_email = u_email;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", U_email=" + U_email +
                '}';
    }
}
