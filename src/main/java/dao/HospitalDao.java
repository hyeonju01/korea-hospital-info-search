package dao;

import domain.Hospital;

@Component
public class HospitalDao {
    private final JdbcTemplate jdbcTemplate;

    public HospitalDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // List<Hospital> inset
    public void add(Hospital hospital) {
        String sql = "INSERT INTO `likelion-db`.`nation_wide_hospitals` " +
                "(`id`, `open_service_name`, `open_local_government_code`, `management_number`, `license_date`, `business_status`, `business_status_code`, `phone`, `full_address`, `road_name_address`, `hospital_name`, `business_type_name`, `healthcare_provider_count`, `patient_room_count`, `total_number_of_beds`, `total_area_size`) " +
                "VALUES ('1', '의원', '3620000', 'PHMA119993620020041100004', '19990612', '1', '13', '062-515-2875', '광주광역시 북구 풍향동 565번지 4호 3층', '광주광역시 북구 동문대로 24, 3층 (풍향동)', '효치과의원', '치과의원', '1', '0', '0', '52.29');";
        String sql2 = "INSERT INTO `likelion-db`.`nation_wide_hospitals` (`id`, `open_service_name`, `open_local_government_code`, `management_number`, `license_date`, `business_status`, `business_status_code`, `phone`, `full_address`, `road_name_address`, `hospital_name`, `business_type_name`, `healthcare_provider_count`, `patient_room_count`, `total_number_of_beds`, `total_area_size`) VALUES ('2', '의원', '3620000', 'PHMA119993620020041100005', '19990707', '1', '13', '062-574-2802', '광주광역시 북구 일곡동 821번지 1호 2층', '광주광역시 북구 설죽로 518, 2층 (일곡동)', '일곡부부치과의원', '치과의원', '2', '0', '0', '200');";
        String sql3;
    }
}
