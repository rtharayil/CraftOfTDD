 public void testReadWrite() throws Exception{
      // Setup:
      FlightMngtFacade facade = new FlightMgmtFacadeImpl();
      // Exercise:
      BigDecimal yyc = facade.createAirport("YYC", "Calgary", "Calgary");
      BigDecimal lax = facade.createAirport("LAX", "LAX Intl", "LA");
      facade.createFlight(yyc, lax);
      List flights = facade.getFlightsByOriginAirport(yyc);
      // Verify:
      assertEquals( "# of flights", 1, flights.size());
      Flight flight = (Flight) flights.get(0);
      assertEquals( "origin", yyc,
                    flight.getOrigin().getCode());
   }

   ..........


   public BigDecimal createAirport( String airportCode, String name,
                                    String nearbyCity)
   throws FlightBookingException{
      TransactionManager.beginTransaction();
      Airport airport = dataAccess.createAirport(airportCode, name, nearbyCity);
      logMessage("Wrong Action Code", airport.getCode());//bug
      TransactionManager.commitTransaction();
      return airport.getId();
   }
  
   public List getFlightsByOriginAirport( BigDecimal originAirportId)
         throws FlightBookingException {
      if (originAirportId == null)
         throw new InvalidArgumentException( "Origin Airport Id has not been provided",
                 "originAirportId", null);     
      Airport origin = dataAccess.getAirportByPrimaryKey(originAirportId);
      List flights = dataAccess.getFlightsByOriginAirport(origin);
      return flights;
   }