package com.personal.demo.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerReadDto {
    private String title;
    private String subtitle;
    private String photoUrl;
}
