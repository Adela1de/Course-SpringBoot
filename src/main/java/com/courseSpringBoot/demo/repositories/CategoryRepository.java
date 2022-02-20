package com.courseSpringBoot.demo.repositories;

import com.courseSpringBoot.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
