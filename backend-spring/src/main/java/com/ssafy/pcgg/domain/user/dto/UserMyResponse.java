package com.ssafy.pcgg.domain.user.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserMyResponse {
    private Long userId;
    private String nickname;
}

