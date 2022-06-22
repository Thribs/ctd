package me.thribs.clinic;

import java.util.Date;

public class Patient {
    String name;
    String lastName;
    String medicalHistory;
    Date admissionDate;
    Date dischargeDate;

    Patient(String name, String lastName, String medicalHistory, Date admissionDate) {
        Date today = new Date();
        this.name = name;
        this.lastName = lastName;
        dischargeDate = null;
        if (admissionDate.before(today))
            this.admissionDate = admissionDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void discharge(Date date) throws PatientAdmissionException {
        final Date now = new Date();
            if (date.after(now) | !date.equals(admissionDate)) throw new PatientAdmissionException("Não pode");
            dischargeDate = date;
    }
}
