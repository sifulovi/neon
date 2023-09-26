package com.sio.neon.acl.feature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sio.neon.acl.feature.data.entity.Feature;

@Service
public class FeatureService {

    public List<Feature> list(
            String name,
            String code,
            String pageSize,
            String pageNo,
            String sort) {
        return List.of();
    }
}
