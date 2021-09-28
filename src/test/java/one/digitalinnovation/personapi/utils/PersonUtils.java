package one.digitalinnovation.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

public class PersonUtils {

		private static final String FIRST_NAME = "Astrogildo";
		private static final String LAST_NAME = "Peixoto";
		private static final String CPF_NUMBER = "537.178.850-65";
		private static final Long PERSON_ID = 1L;
		private static final LocalDate BIRTH_DATE = LocalDate.of(2017, 10, 5);
		
		public static PersonDTO createFakeDTO() {
			return PersonDTO.builder()
					.firstName(FIRST_NAME)
					.lastName(LAST_NAME)
					.cpf(CPF_NUMBER)
					.birthDate("05-06-2012")
					.phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
					.build();
		}
		
		public static Person createFakeEntity() {
			return Person.builder()
					.id(PERSON_ID)
					.firstName(FIRST_NAME)
					.lastName(LAST_NAME)
					.cpf(CPF_NUMBER)
					.birthDate(BIRTH_DATE)
					.phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
					.build();
		}
}
