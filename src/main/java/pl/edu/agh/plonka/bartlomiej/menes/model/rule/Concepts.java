package pl.edu.agh.plonka.bartlomiej.menes.model.rule;

import pl.edu.agh.plonka.bartlomiej.menes.model.Entity;
import pl.edu.agh.plonka.bartlomiej.menes.model.Patient;

import java.util.Collection;

public class Concepts {

    //TODO
/*
    public Collection<Entity> diseases;
    public Collection<Entity> tests;
    public Collection<Entity> treatments;
    public Collection<Entity> causes;
*/

    public Concepts() {
    }

    public Concepts(Patient patient) {
        //TODO
//        diseases = patient.getDiseases();
//        tests = patient.getTests();
//        treatments = patient.getTreatments();
//        causes = patient.getCauses();
    }

    public boolean covers(Patient patient) {
        //TODO
//        return diseases.containsAll(patient.getDiseases()) && tests.containsAll(patient.getTests())
//                && treatments.containsAll(patient.getTreatments()) && causes.containsAll(patient.getCauses());
        return false;
    }

}