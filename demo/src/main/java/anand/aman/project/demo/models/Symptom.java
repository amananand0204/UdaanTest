package anand.aman.project.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;

    @ManyToMany
    @JoinTable(name = "risk_symptom", joinColumns = @JoinColumn(name = "risk_id"), inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    public Set<Risk> risks = new HashSet<>();

    public Set<Risk> getRisks() {
        return risks;
    }

    public void setRisks(Set<Risk> risks) {
        this.risks = risks;
    }

    public Symptom() {
    }

    public Symptom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symptom symptom = (Symptom) o;
        return Objects.equals(id, symptom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "name='" + name + '\'' +
                '}';
    }
}
