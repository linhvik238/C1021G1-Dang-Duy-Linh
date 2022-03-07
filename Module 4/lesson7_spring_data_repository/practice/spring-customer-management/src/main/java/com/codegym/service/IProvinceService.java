package com.codegym.service;

import com.codegym.model.Province;

public interface IProvinceService extends IGeneralService<Province>{

    Iterable<Province> findAll();
}
