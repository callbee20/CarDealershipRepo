/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 6 2022
 */
package controller;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date>{

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		// TODO Auto-generated method stub
		return (attribute == null ? null: Date.valueOf(attribute));	
		}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		// TODO Auto-generated method stub
		return (dbData == null ? null: dbData.toLocalDate());	
	}

}
//implementation has been removed from this project mayhbe