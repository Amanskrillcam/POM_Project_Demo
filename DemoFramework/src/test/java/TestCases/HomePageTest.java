package TestCases;

import Basepackage.BaseTest;
import Interface.HomePageInterface;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
//        HomePage oo;

        @Test(priority = 0)
        public void validateAdminModuletest()
        {
//                oo=new HomePage();
                obj.gethomepage().validateAdminModule();
        }
        @Test(priority = 1)
        public void validatePimtest(){obj.gethomepage().validatePim();}
        @Test(priority = 2)
        public void validateLeaveTest () {obj.gethomepage().validateLeave();}
        @Test(priority = 3)
        public void validateTimeTest (){obj.gethomepage().validateTime();}
        @Test(priority = 4)
        public void validateRecruitmentTest (){obj.gethomepage().validateRecruitment();}
        @Test(priority = 5)
        public void validateMyinfoTest (){obj.gethomepage().validateMyinfo();}
        @Test(priority = 6)
        public void validatePerformanceTest (){obj.gethomepage().validatePerformance();}
        @Test(priority = 7)
        public void validateDashboardTest (){obj.gethomepage().validateDashboard();}
        @Test(priority = 8)
        public void validateDirectoryTest(){obj.gethomepage().validateDirectory();}
        @Test(priority = 9)
        public void validateMaintenanceTest(){obj.gethomepage().validateMaintenance();}
        @Test(priority = 10)
        public void validateBuzzTest(){obj.gethomepage().validateBuzz();}
        @Test(priority = 11)
        public void validateLogoutTest(){obj.gethomepage().logout();}

}
