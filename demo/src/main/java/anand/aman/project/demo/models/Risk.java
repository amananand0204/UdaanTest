package anand.aman.project.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Risk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public boolean travelHistory;
    public boolean contactWithPatient;

    @OneToOne
    public User user;

    @ManyToMany(mappedBy = "risks")
    public Set<Symptom> symptoms = new HashSet<>();

    public Risk() {
    }

    public Risk(boolean travelHistory, boolean contactWithPatient, Set<Symptom> symptoms) {
        this.travelHistory = travelHistory;
        this.contactWithPatient = contactWithPatient;
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isContactWithPatient() {
        return contactWithPatient;
    }

    public void setContactWithPatient(boolean contactWithPatient) {
        this.contactWithPatient = contactWithPatient;
    }

    public Set<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Set<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Risk risk = (Risk) o;
        return Objects.equals(id, risk.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Risk{" +
                "id=" + id +
                ", travelHistory=" + travelHistory +
                ", contactWithPatient=" + contactWithPatient +
                ", symptoms=" + symptoms +
                '}';
    }

//    public int RiskCalculation(){
//        if(symptoms.stream().count() == 0){
//            return 5;
//        }
//        if()
//    }
}
