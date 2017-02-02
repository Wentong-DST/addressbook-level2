package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's block in the full address.
 */
public class Block {
	
	private final String block;
	
	public Block(String block) {
		this.block = block;
	}
	
	public String getBlock() {
		return block;
	}
	
	@Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }
}