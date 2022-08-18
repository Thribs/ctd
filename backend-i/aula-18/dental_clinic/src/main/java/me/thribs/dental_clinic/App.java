package me.thribs.dental_clinic;

import java.time.LocalDate;

import me.thribs.dental_clinic.model.Address;
import me.thribs.dental_clinic.model.Dentist;
import me.thribs.dental_clinic.model.Patient;

public class App {
    
    public static String insertDentistSql = "insert into dentists (firstName, lastName, registrationNumber) values (?, ?, ?)";
    public static String updateDentistSql = "update dentists set firstName = ?, lastName = ?, registrationNumber = ? where id = ?";
    public static String selectAllDentistsSql = "select * from dentists";
    public static String truncateDentistSql = "truncate table dentists";

    public static void main(String[] args) {

        Dentist john = new Dentist("John", "Doe","12345");
        Dentist jane = new Dentist("Jane", "Doe","54321");
        Address address1 = new Address(1, "Rua 1", 1, "São Paulo", "Jardim Paulista");
        Address address2 = new Address(2, "Rua 2", 2, "Brasília", "Taguatinga");
        Address address3 = new Address(3, "Rua 3", 3, "Rio de Janeiro", "Copacabana");
        Patient jack = new Patient(1, "Jack", "Doe", "12345", LocalDate.now(), address1);
        Patient jill = new Patient(2, "Jill", "Doe", "54321", LocalDate.now(), address2);
    }
}