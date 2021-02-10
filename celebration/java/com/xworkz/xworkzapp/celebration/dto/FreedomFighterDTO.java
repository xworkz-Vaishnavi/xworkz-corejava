package com.xworkz.xworkzapp.celebration.dto;

public class FreedomFighterDTO {

	private String name;
	private String birthPlace;
	private Gender gender;

	public enum Gender {
		MALE, FEMALE
	}

	/**
	 * @param name
	 * @param birthPlace
	 * @param gender
	 */
	public FreedomFighterDTO(String name, String birthPlace, Gender gender) {
		super();
		this.name = name;
		this.birthPlace = birthPlace;
		this.gender = gender;
	}

	@Override
	public int hashCode() {

		return 777;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof FreedomFighterDTO) {
			FreedomFighterDTO casted = (FreedomFighterDTO) obj;
			if (casted.getName() != null && casted.getName().equals(this.getName())) {
				return true;

			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public Gender getGender() {
		return gender;
	}

}
