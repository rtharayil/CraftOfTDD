@Before
		public void setUp() throws Exception {
			alice = new Person();
			alice.setId(1L);
			alice.setFirstname("Alice");
			alice.setLastname("Adams");
			alice.setSsn("111111");

			billy = new Person();
			billy.setId(2L);
			billy.setFirstname("Billy");
			billy.setLastname("Burke");
			billy.setSsn("222222");

			clark = new Person();
			clark.setId(3L);
			clark.setFirstname("Clark");
			clark.setLastname("Cable");
            clark.setSsn("333333");
            
            rahul = new Person();
			rahul.setId(3L);
			rahul.setFirstname("Rahul");
			rahul.setLastname("Ram");
            rahul.setSsn("4444444");
            
            nisha = new Person();
			nisha.setId(3L);
			nisha.setFirstname("Nisha");
			nisha.setLastname("Thomas");
            nisha.setSsn("5555555");
            
            amina = new Person();
			amina.setId(3L);
			amina.setFirstname("Amina");
			amina.setLastname("M");
            amina.setSsn("6666666");
            

            ......

            alice.isInLoveWith(billy);
            rahul.isisInLoveWith(amina);

            ......
		}
