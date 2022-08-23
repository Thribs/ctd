package me.thribs.employees.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Company implements Serializable {
    
    private final String cnpj;
    private final String fantasyName;
    private List<Employee> employees = new ArrayList<>();

    public Company(String cnpj, String fantasyName) {
        this.cnpj = cnpj;
        this.fantasyName = fantasyName;
    }

    public String getCnpj() { return this.cnpj; }

    public String getFantasyName() { return this.fantasyName; }

    public String getEmployees() {
        String str = "";
        for (Employee employee : this.employees) { str += employee + "\n"; };
        return str;
    }

    @Override
    public String toString() { return "{Empresa: CNPJ: " + this.cnpj + "; Nome fantasia: " + this.fantasyName + "; Funcionários: " + getEmployees() + ";}"; }

}