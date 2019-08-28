package com.utilities;

import java.util.List;

import com.model.entities.Person;

public class PersonListContainer {
	private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
