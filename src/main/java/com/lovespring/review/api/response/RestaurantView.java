package com.lovespring.review.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Builder
@AllArgsConstructor
public class RestaurantView {
    private final Long id;
    private final String name;
    private final String address;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
