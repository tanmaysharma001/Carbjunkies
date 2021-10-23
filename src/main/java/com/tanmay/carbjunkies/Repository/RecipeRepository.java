package com.tanmay.carbjunkies.Repository;

import com.tanmay.carbjunkies.Model.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeModel,Integer> {

}
