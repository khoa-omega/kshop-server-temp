package com.vti.kshop.service;

import com.vti.kshop.dto.AccessoryDto;
import com.vti.kshop.form.AccessoryCreateForm;
import com.vti.kshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);
}
