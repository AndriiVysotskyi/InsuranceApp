package insurance.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.lang.model.type.PrimitiveType;

import insurance.dto.enums.Gender;
import insurance.dto.enums.Title;
import lombok.*;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
public @Data class PersonDto implements Serializable {
	private int idPerson;
	private Title title;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Gender gender;
	private long licenseNumber;
	private LocalDate licenseIssueDate;
	private LocalDate licenseExpirationDate;
	private LocalDate createDate;
	
	private AdditionalInfoDto additionalInfo;
	
// creatData
	public PersonDto(int idPerson, Title title, String firstName, String lastName, LocalDate dateOfBirth, Gender gender,
			long licenseNumber, LocalDate licenseIssueDate, LocalDate licenseExpirationDate) {
		this.idPerson = idPerson;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.licenseNumber = licenseNumber;
		this.licenseIssueDate = licenseIssueDate;
		this.licenseExpirationDate = licenseExpirationDate;
	}
	
	
}
