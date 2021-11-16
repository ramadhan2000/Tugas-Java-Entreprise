package com.exa.api.service.impl
import com.exa.api.entity.Category
import com.exa.api.repository.CategoryRepository
import com.exa.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl implements CategoryService {
 @Autowired
 private final CategoryRepository CategoryRepository
 @Override
 List<Category> findAll() {
 CategoryRepository.findAll()
 }
 @Override
 Category findById(int id) {
 CategoryRepository.findById(id)
 }
 @Override
 Category save(Category category) {
 CategoryRepository.save(category)
 }
}
