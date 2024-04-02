package ma.spring.tp2.service;

import ma.spring.tp2.entities.Consultation;
import ma.spring.tp2.entities.Medecin;
import ma.spring.tp2.entities.Patient;
import ma.spring.tp2.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
