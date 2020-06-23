public class EmpWage
{
        public static final int partTime=1;
        public static final int fullTime=2;
        public static final int empRatePerHr=20;
        public static final int numOfWorkingDays=20;
        public static final int maxHrsInMonth=20;

        public static int computeCompany1(int empHrs, int totalEmpHrs,int totalWorkingDays)
        {
                empHrs=0;
                totalEmpHrs=0;
                totalWorkingDays=0;
                System.out.println(" ----------Company ABC---------- ");
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
                System.out.println("Total Employee wage :"+totalEmpWage);
                return totalEmpWage;
        }


         public static int computeCompany2(int empHrs,int totalEmpHrs,int totalWorkingDays)
        {
                empHrs=0;
                totalEmpHrs=0;
                totalWorkingDays=0;
                System.out.println(" ----------Company XYZ---------- ");
		   
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
                System.out.println("Total Employee wage :"+totalEmpWage);
                return totalEmpWage;
        }

        public static void main(String args[])
        {
                int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
                computeCompany1(empHrs,totalEmpHrs,totalWorkingDays);
                computeCompany2(empHrs,totalEmpHrs,totalWorkingDays);

        }

}

