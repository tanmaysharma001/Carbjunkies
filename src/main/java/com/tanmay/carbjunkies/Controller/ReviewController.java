package com.tanmay.carbjunkies.Controller;

import com.tanmay.carbjunkies.Model.RecipeModel;
import com.tanmay.carbjunkies.Model.ReviewModel;
import com.tanmay.carbjunkies.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    @GetMapping("/reviewView/{id}")
    public String getReview(Model model, @PathVariable("id") int id)
    {

        ReviewModel reviewModel = reviewService.getReviewById(id);
        model.addAttribute("reviewModel", reviewModel);
        return "reviewView";
    }

    @GetMapping("/reviewList")
    public String getAllReviews(Model model)
    {
        List<ReviewModel> reviewModelList = reviewService.getAllReviews();
        model.addAttribute("allReviews", reviewModelList);
        //System.out.println(reviewService.getAllReviews());
        return "reviewList";
    }

    @GetMapping("/reviewAdd")
    public String reviewAdd(Model model) {
        ReviewModel reviewModel= new ReviewModel();
        model.addAttribute("reviewModel", reviewModel);
        return "reviewAdd";
    }


    @PostMapping("/reviewAdd")
    public String saveReview(ReviewModel reviewModel)
    {
        reviewService.saveReview(reviewModel);
        return "reviewSaved";
    }

}
