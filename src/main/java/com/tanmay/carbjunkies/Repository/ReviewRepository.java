package com.tanmay.carbjunkies.Repository;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewModel, Integer> {
}
