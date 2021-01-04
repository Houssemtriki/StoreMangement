package tn.iit.storemanegement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import tn.iit.storemanegement.dao.IMedicalFile;
import tn.iit.storemanegement.domaine.Medicament;
import tn.iit.storemanegement.dto.MedicalFileDto;
import tn.iit.storemanegement.mapper.MedicalFileMapper;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;
@Transactional
@Service
public class MedicamentService {
    private final IMedicalFile iMedicalFile;
    @Autowired
    public MedicamentService(IMedicalFile iMedicalFile) {
        this.iMedicalFile = iMedicalFile;
    }

    public MedicalFileDto save(MedicalFileDto medicalFileDto) {
        this.iMedicalFile.saveAndFlush(MedicalFileMapper.medicamentDtoToMedicament(medicalFileDto));
        return medicalFileDto;
    }

    public void deleteById(Long id) {
        this.iMedicalFile.deleteById(id);
    }

    public MedicalFileDto findOne(Long id) {
        Optional<Medicament> medicament = this.iMedicalFile.findById(id);
        if (medicament.isEmpty()) {
            //throw new ResourceNotFoundException ("Medicament with id " + id + " not found");
        }
        return MedicalFileMapper.medicamentToMedicalFileDto(medicament.get());
    }
    public Collection<MedicalFileDto> findAll(){
        return MedicalFileMapper.medicamentsToMedicamentDtos (this.iMedicalFile.findAll ());
    }

}
