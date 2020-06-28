public class EmpWage implements IComputeEmpWage
{
        public static final int partTime=1;
        public static final int fullTime=2;

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWage()
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth)
	{
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays, maxHrsInMonth);
		numOfCompany++;
	}

	public void computeCompany()
	{
		for(int i=0; i<numOfCompany; i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeCompany(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}	

        private int computeCompany(CompanyEmpWage companyEmpWage)
        {
                int empHrs=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;
                System.out.println(" ----------Employee Wage for Company---------- ");
                while (totalEmpHrs<=companyEmpWage.maxHrsInMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
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
                return  totalEmpHrs*companyEmpWage.empRatePerHr;
	}

	public static void main(String args[])
	{
		EmpWage empWage = new EmpWage();
        	empWage.addCompanyEmpWage("BigBazar", 20, 2, 10);
		empWage.addCompanyEmpWage("Reliance", 10, 4, 20);       
		empWage.computeCompany();
	}
}


interface IComputeEmpWage
{
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth);
	public void computeCompany();
}	
 class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth)
	{
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;	
	}
	public String toString()
	{
		return "Total Emp Wage for Company :"+company+" is :"+totalEmpWage;
	}
}
