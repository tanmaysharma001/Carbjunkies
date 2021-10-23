package com.tanmay.carbjunkies.Service;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Model.ReviewModel;
import com.tanmay.carbjunkies.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public ReviewModel saveReview(ReviewModel reviewModel)
    {
        reviewRepository.save(reviewModel);
        return reviewModel;
    }

    public List<ReviewModel> getAllReviews()
    {
        return reviewRepository.findAll();
    }

    public ReviewModel getReviewById(int id)
    {
        return reviewRepository.getById(id);
    }
}
