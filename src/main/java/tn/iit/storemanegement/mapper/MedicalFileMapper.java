package tn.iit.storemanegement.mapper;

import tn.iit.storemanegement.domaine.Category;
import tn.iit.storemanegement.domaine.Medicament;
import tn.iit.storemanegement.dto.CategoryDto;
import tn.iit.storemanegement.dto.MedicalFileDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MedicalFileMapper {
    public static MedicalFileDto medicamentToMedicalFileDto(Medicament medicament) {
        MedicalFileDto medicalFileDto = new MedicalFileDto();
        medicalFileDto.setId (medicament.getId ());
        medicalFileDto.setDosage (medicament.getDosage ());
        medicalFileDto.setCategoryName (medicament.getCategory ().getName ());
        medicalFileDto.setCategoryId (medicament.getCategory ().getId ());
        medicalFileDto.setExpiredDate (medicament.getExpireDate ());
        medicalFileDto.setPrice (medicament.getPrice ());
        medicalFileDto.setName (medicament.getName ());
        return medicalFileDto;
    }

    public static Medicament medicamentDtoToMedicament(MedicalFileDto medicamentDto) {
        Medicament medicament =new Medicament();
        medicament.setId(medicamentDto.getId());
        medicament.setDosage(medicamentDto.getDosage());
        Category category = new Category(medicamentDto.getCategoryId(), medicamentDto.getCategoryName());
        medicament.setCategory(category);
        medicament.setExpireDate (medicamentDto.getExpiredDate ());
        medicament.setPrice(medicamentDto.getPrice());
        medicament.setName(medicamentDto.getName());
        return medicament;
    }
    public static Collection<MedicalFileDto> medicamentsToMedicamentDtos(Collection<Medicament> medicaments)
    {
        List<MedicalFileDto> medicamentDtoList = new ArrayList<>();
        medicaments.forEach(medicament -> {
            medicamentDtoList.add (medicamentToMedicalFileDto (medicament));
        });
        return medicamentDtoList;
    }

}
