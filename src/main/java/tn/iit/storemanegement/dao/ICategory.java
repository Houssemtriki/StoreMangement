package tn.iit.storemanegement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.storemanegement.domaine.Category;
@Repository
public interface ICategory extends JpaRepository<Category,Long> {
}
