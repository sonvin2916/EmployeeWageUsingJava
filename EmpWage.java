public class EmpWage
{
        public static final int partTime=1;
        public static final int fullTime=2;

	private int numOfCompany=0;
	private CompanyWage[] wageArray;

	public EmpWage()
	{
		wageArray = new CompanyWage[5];
	}

	private void addCompanyWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth)
	{
		wageArray[numOfCompany] = new CompanyWage(company,empRatePerHr,numOfWorkingDays, maxHrsInMonth);
		numOfCompany++;
	}

	private void computeCompany()
	{
		for(int i=0; i<numOfCompany; i++)
		{
			wageArray[i].setTotalEmpWage(this.computeCompany(wageArray[i]));
			System.out.println(EmpWageArray[i]);
		}
	}	

        private int computeCompany(CompanyWage compWage)
        {
                int empHrs=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;
                System.out.println(" ----------Employee Wage for Company---------- ");
                while (totalEmpHrs<=compWage.maxHrsInMonth && totalWorkingDays<compWage.numOfWorkingDays)
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
                return  totalEmpHrs*compWage.empRatePerHr;
	}

	public static void main(String args[])
	{
		EmpWage empWage = new EmpWage();
        	empWage.addCompanyEmpWage("BigBazar", 20, 2, 10);
		empWage.addCompanyEmpWage("Reliance", 10, 4, 20);       
		empWage.computeCompany();
	}
}

	
