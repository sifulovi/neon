package com.sio.neon.acl.feature.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Feature {
    private Long id;
    private String name;
    private String code;
    private String url;
}
