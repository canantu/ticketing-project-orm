package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;
    RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> ListAllRoles() {

        return roleRepository.findAll().stream().map(roleMapper::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {

        return roleMapper.convertToDTO(roleRepository.findById(id).get());
    }
}
