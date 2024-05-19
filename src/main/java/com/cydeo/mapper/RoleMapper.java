package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    private final ModelMapper modelMapper;

    public Role convertToEntity(RoleDTO roleDTO){
        return modelMapper.map(roleDTO, Role.class);
    }

    public RoleDTO convertToDTO(Role role){
        return modelMapper.map(role, RoleDTO.class);
    }

}
