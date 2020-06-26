public class EmpWage
{
        public static final int partTime=1;
        public static final int fullTime=2;
        public static final int empRatePerHr=20;
        public static final int numOfWorkingDays=20;
        public static final int maxHrsInMonth=20;

        public static int computeCompany(String company , int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth)
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
                int totalEmpWage = totalEmpHrs*empRatePerHr;
                System.out.println();
                System.out.println("Total Employee wage for company " +company+ " is:"+totalEmpWage);
         	 return totalEmpWage;
	}
        public static void main(String args[])
        {
               
                computeCompany("BigBazar",20,20,10);
		computeCompany("Reliance",20,20,10);
           

        }

}

