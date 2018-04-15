@Test
 	public void testAvailability() {
 	   theTrialHolding.checkOut();
 	   assertFalse(theTrialHolding.isAvailable());
 	
 	   theTrialHolding.checkIn();
 	   assertTrue(theTrialHolding.isAvailable());
 	}
