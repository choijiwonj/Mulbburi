package com.water.Mulbburi.calculator;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.order.OrderDTO;

@Mapper
public interface CalculatorMapper {

	List<CalculatorDTO> selectAllCal(CalculatorDTO calDTO);

}
