package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's unit in the full address.
 */
public class Unit {
	
	private final String unit;
	
	public Unit(String unit) {
		this.unit = unit;
	}
	
	public String getUnit() {
		return unit;
	}
	
	@Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }
}