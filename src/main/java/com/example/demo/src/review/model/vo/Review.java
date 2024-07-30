package com.example.demo.src.review.model.vo;

import com.example.demo.src.review.model.dto.ReviewRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private int reviewId;
    private String userUuid;
    private int storeId;
    private int reviewScore;
    private String reviewContents;
    private String reviewImg;
    private Date reviewDate;

    // ReviewRequestDto를 통해 Review 초기화
    public Review(ReviewRequestDto requestDto, String userUUId) {
        this.userUuid = userUUId;
        this.storeId = requestDto.getStoreId();
        this.reviewScore = requestDto.getReviewScore();
        this.reviewContents = requestDto.getReviewContents();
        this.reviewImg = requestDto.getReviewImg();

    }

}