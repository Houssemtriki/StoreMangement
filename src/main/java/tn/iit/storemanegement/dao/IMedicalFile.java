package tn.iit.storemanegement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.storemanegement.domaine.Medicament;
@Repository
public interface IMedicalFile extends JpaRepository<Medicament,Long> {
}
