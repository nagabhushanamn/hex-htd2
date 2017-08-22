package com;

/*
 *   Checked  vs InChecked
 * 
 */

class AccountBalanceException extends RuntimeException {
	public AccountBalanceException(String message) {
		super(message);
	}
}

// -----------------------------------------------------------------------------
// BankTxr - module

class TxrServiceImpl {
	public boolean doTxr(double amount, String fromAccount, String toAccount) {
		// load from & to accounts
		double fromAccountBalance = 1000.00;
		if (amount > fromAccountBalance) {
			throw new AccountBalanceException("Declined , No enough balance");
		}
		return true;
	}
}

// -----------------------------------------------------------------------------

// -----------------------------------------------------------------------------
// FlightTicketBooking - module

class TicketBooking {

	TxrServiceImpl txrService = new TxrServiceImpl();

	public void bookTicket() {

		txrService.doTxr(5000.00, "1", "2");
		System.out.println("Ticket has booked");

	}

}

// -----------------------------------------------------------------------------

public class Ex3 {

	public static void main(String[] args) {

		try {
			TicketBooking booking = new TicketBooking();
			booking.bookTicket();
		} catch (AccountBalanceException e) {
			System.err.println(e.getMessage());
		}

	}

}
