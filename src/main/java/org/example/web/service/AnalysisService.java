package org.example.web.service;

import jakarta.annotation.Resource;
import org.example.web.mapper.AnalysisMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AnalysisService {
    @Resource
    private AnalysisMapper analysisMapper;

    public int getEmployeeCountByGender(String gender) {
        return analysisMapper.countByEmployeeGender(gender);
    }

    public int getEmployeeCountByDepartment(String department) {
        return analysisMapper.countByEmployeeDepartment(department);
    }

    public int getEmployeeCountByAge(int startAge, int endAge) {
        return analysisMapper.countByEmployeeAge(startAge, endAge);
    }

    public int getEmployeeCountByHireDate(LocalDate startDate, LocalDate endDate) {
        return analysisMapper.countByEmployeeHireDate(startDate, endDate);
    }
    public int getEmployeeCountByAddress(String address){
        return analysisMapper.countByEmployeeAddress(address);
    }

    public String[][] getGenderEmployeeCount() {
        int maleCount = getEmployeeCountByGender("男");
        int femaleCount = getEmployeeCountByGender("女");
        return new String[][]{{"男", String.valueOf(maleCount)}, {"女", String.valueOf(femaleCount)}};
    }

    public String[][] getDepartmentEmployeeCount() {
        int qualityCount = getEmployeeCountByDepartment("产品质量部");
        int humanCount = getEmployeeCountByDepartment("人力资源部");
        int fiance = getEmployeeCountByDepartment("会计及金融部");
        int technology = getEmployeeCountByDepartment("信息技术支持部");
        int pub = getEmployeeCountByDepartment("公关部");
        int sale = getEmployeeCountByDepartment("外销部");
        int engineer = getEmployeeCountByDepartment("工程部");
        int market = getEmployeeCountByDepartment("市场部");
        int serv = getEmployeeCountByDepartment("服务支持部");

        return new String[][]{
                {"产品质量部", String.valueOf(qualityCount)},
                {"人力资源部", String.valueOf(humanCount)},
                {"会计及金融部", String.valueOf(fiance)},
                {"信息技术支持部", String.valueOf(technology)},
                {"公关部", String.valueOf(pub)},
                {"外销部", String.valueOf(sale)},
                {"工程部", String.valueOf(engineer)},
                {"市场部", String.valueOf(market)},
                {"服务支持部", String.valueOf(serv)}
        };
    }

    public String[][] getAgeEmployeeCount() {
        int range30 = getEmployeeCountByAge(18, 30);
        int range40 = getEmployeeCountByAge(31, 40);
        int range50 = getEmployeeCountByAge(41, 50);
        int range60 = getEmployeeCountByAge(51, 60);

        return new String[][]{
                {"18-30", String.valueOf(range30)},
                {"31-40", String.valueOf(range40)},
                {"41-50", String.valueOf(range50)},
                {"51-60", String.valueOf(range60)}
        };
    }

    public String[][] getHireDateEmployeeCount() {
        int hire5 = getEmployeeCountByHireDate(LocalDate.of(2000, 1, 1), LocalDate.of(2005, 1, 1));
        int hire10 = getEmployeeCountByHireDate(LocalDate.of(2005, 1, 2), LocalDate.of(2010, 10, 10));
        int hire15 = getEmployeeCountByHireDate(LocalDate.of(2010, 1, 2), LocalDate.of(2015, 1, 1));
        int hire20 = getEmployeeCountByHireDate(LocalDate.of(2015, 1, 2), LocalDate.of(2020, 1, 1));
        int hire24 = getEmployeeCountByHireDate(LocalDate.of(2020, 1, 2), LocalDate.of(2024, 1, 1));

        return new String[][]{
                {"0-5 years", String.valueOf(hire5)},
                {"6-10 years", String.valueOf(hire10)},
                {"11-15 years", String.valueOf(hire15)},
                {"16-20 years", String.valueOf(hire20)},
                {"21-24 years", String.valueOf(hire24)}
        };
    }
    public String[][] getAddressEmployeeCount(){
        int shanghai = getEmployeeCountByAddress("上海");
        int shenzhen = getEmployeeCountByAddress("深圳");
        int chengdu = getEmployeeCountByAddress("成都");
        int zhongshan = getEmployeeCountByAddress("中山");
        int dongguan = getEmployeeCountByAddress("东莞");
        int beijing = getEmployeeCountByAddress("北京");
        int guangzhou = getEmployeeCountByAddress("广州");
        return new String[][]{
                {"上海",String.valueOf(shanghai)},
                {"深圳",String.valueOf(shenzhen)},
                {"成都",String.valueOf(chengdu)},
                {"中山",String.valueOf(zhongshan)},
                {"东莞",String.valueOf(dongguan)},
                {"北京",String.valueOf(beijing)},
                {"广州",String.valueOf(guangzhou)}
        };
    }
}
