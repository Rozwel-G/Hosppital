package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(String patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}