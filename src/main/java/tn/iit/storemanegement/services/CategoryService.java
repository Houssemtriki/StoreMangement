package tn.iit.storemanegement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.storemanegement.dao.ICategory;
import tn.iit.storemanegement.dto.CategoryDto;
import tn.iit.storemanegement.mapper.CategoryMapper;

import javax.transaction.Transactional;
import java.util.Collection;
@Transactional
@Service
public class CategoryService {
    private final ICategory iCategory;

    @Autowired
    public CategoryService(ICategory iCategory) {
        this.iCategory = iCategory;
    }

    public CategoryDto save(CategoryDto categoryDto) {
        this.iCategory.saveAndFlush(CategoryMapper.categoryDtoToCategory(categoryDto));
        return categoryDto;
    }
    public void deleteById(Long id) {
        this.iCategory.deleteById(id);

    }

    public CategoryDto findOne(Long id) {
        return CategoryMapper.categoryToCategoryDto(this.iCategory.getOne(id));
    }

    public Collection<CategoryDto> findAll() {
        return CategoryMapper.categoriesToCategoriesDtos(this.iCategory.findAll());
    }
}
