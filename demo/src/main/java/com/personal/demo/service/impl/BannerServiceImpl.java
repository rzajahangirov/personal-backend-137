package com.personal.demo.service.impl;


import com.personal.demo.dtos.BannerReadDto;
import com.personal.demo.models.Banner;
import com.personal.demo.repsitory.BannerRepository;
import com.personal.demo.service.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;

    @Override
    public BannerReadDto getBanner() {
        Banner banner = bannerRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Banner not found"));
        BannerReadDto dto = new BannerReadDto();
        dto.setTitle(banner.getTitle());
        dto.setSubtitle(banner.getSubtitle());
        dto.setPhotoUrl(banner.getPhotoUrl());
        return dto;
    }
}
