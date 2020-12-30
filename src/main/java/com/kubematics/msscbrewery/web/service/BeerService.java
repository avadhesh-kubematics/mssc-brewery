package com.kubematics.msscbrewery.web.service;

import com.kubematics.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
