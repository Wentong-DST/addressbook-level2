package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's block in the full address.
 */

public class PostalCode {

	private final String postalCode;
	
	public PostalCode(String code) {
		this.postalCode = code;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	@Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }
}