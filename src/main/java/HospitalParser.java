import java.time.LocalDateTime;
import java.util.Arrays;

public class HospitalParser implements Parser<Hospital>{

    @Override
    public Hospital parse(String str) {
        /* mapping (column to variable)
        id col:0
        OpenServiceName col:1 /
        ...
         */

        String[] row = str.split("\",\"");
        System.out.println(Arrays.toString(row));
        Hospital hospital = new Hospital();
        hospital.setId(Integer.parseInt(row[0].replace("\n","")));

        hospital.setOpenServiceName(row[1]);
        hospital.setOpenLocalGovernmentCode(Integer.parseInt(row[3]));
        hospital.setManagementNumber(row[4]);

        // substring 사용하여 연월일 출력
        int year = Integer.parseInt(row[5].substring(0, 4)); //0~3
        int month = Integer.parseInt(row[5].substring(4, 6)); //4~5
        int day = Integer.parseInt(row[5].substring(6, 8)); //6~7
        // test code
        // System.out.printf("%d %d %d \n", year, month, day);
        hospital.setLicenseDate(LocalDateTime.of(year, month, day, 0, 0, 0));

        hospital.setBusinessStatus(Integer.parseInt(row[7]));
        hospital.setBusinessStatusCode(Integer.parseInt(row[9]));
        hospital.setPhone(row[15]);
        hospital.setFullAddress(row[18]);
        hospital.setRoadNameAddress(row[19]);
        hospital.setHospitalName(row[21]);
        hospital.setBusinessTypeName(row[25]);
        hospital.setHealthcareProviderCount(Integer.parseInt(row[29]));
        hospital.setPatientRoomCount(Integer.parseInt(row[30]));
        hospital.setTotalNumberOfBeds(Integer.parseInt(row[31]));
        hospital.setTotalAreaSize(Float.parseFloat(row[32].replace("\"", "")));

        return hospital;
    }
}
