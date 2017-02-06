package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's block in the full address.
 */

public class Street {

	private final String street;
	
	public Street(String street) {
		this.street = street;
	}
	
	public String getStreet(){
		return street;
	}
	
	@Override
    public String toString() {
        return "STREET " + street;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.street.equals(((Street) other).street)); // state check
    }
}