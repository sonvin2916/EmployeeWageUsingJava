public class EmpWage
{
        public static final int partTime=1;
        public static final int fullTime=2;

	private final String company;
        private final int empRatePerHr;
        private final int numOfWorkingDays;
        private final int maxHrsInMonth;
	private int totalEmpWage;

	public EmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth)
	{
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}
	
        public void computeCompany()
        {
                int empHrs=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;
                System.out.println(" ----------Employee Wage for Company---------- ");
                while (totalEmpHrs<=maxHrsInMonth && totalWorkingDays<numOfWorkingDays)
                {
                        int empCheck=(int)Math.floor(Math.random() * 10) % 3;
                        switch (empCheck)
                        {
                                case partTime:
                                   empHrs=4;
                                   break;
                                case fullTime:
                                   empHrs=8;
                                   break;
                                default:
                                   empHrs=0;
                        }
                        totalWorkingDays+=1;
                        totalEmpHrs = totalEmpHrs + empHrs;
                        System.out.println("Day: "+totalWorkingDays+" Emp Hr : "+empHrs);
                }
                totalEmpWage = totalEmpHrs*empRatePerHr;
	}


	public String toString()
	{
                
      	return "Total Employee wage for company " +company+ " is:"+totalEmpWage;
      
	}
	public static void main(String args[])
	{
        	EmpWage Bigbazar = new EmpWage("BigBazar", 20, 2, 10);
		EmpWage reliance = new EmpWage("Reliance", 10, 4, 20);       
		Bigbazar.computeCompany();
		reliance.computeCompany();

		System.out.println(Bigbazar);
		System.out.println(reliance);
	}
}

	
