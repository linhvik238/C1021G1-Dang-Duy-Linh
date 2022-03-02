package service.Impl;

import model.customer.CustomerType;
import repository.CustomerTypeRepository;
import repository.Impl.CustomerTypeRepositoryImpl;
import service.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeRepository customerTypeRepository =new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
