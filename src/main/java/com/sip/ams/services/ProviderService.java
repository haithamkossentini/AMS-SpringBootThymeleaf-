package com.sip.ams.services;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProviderService {
    private final ProviderRepository providerRepository;

    @Autowired
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }
    public List<Provider> getAllProvider(){
        return (List<Provider>)providerRepository.findAll();

    }

    public Provider persistProvider(Provider provider)
    {
        /// autres traiteement
        return  this.providerRepository.save(provider);
    }
}
