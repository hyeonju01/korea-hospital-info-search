import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Hospital {
    private int id;
    private String OpenServiceName;
    private int OpenLocalGovernmentCode;
    private String ManagementNumber;
    private LocalDateTime LicenseDate;
    private int businessStatus;
    private int businessStatusCode;
    private String phone;
    private String fullAddress;
    private String roadNameAddress;
    private String hospitalName;
    private String businessTypeName;
    private int healthcareProviderCount;
    private int patientRoomCount;
    private int totalNumberOfBeds;
    private float totalAreaSize;


    public void setId(int id) {
        this.id = id;
    }

    public void setOpenServiceName(String openServiceName) {
        OpenServiceName = openServiceName;
    }

    public void setOpenLocalGovernmentCode(int openLocalGovernmentCode) {
        OpenLocalGovernmentCode = openLocalGovernmentCode;
    }

    public void setManagementNumber(String managementNumber) {
        ManagementNumber = managementNumber;
    }

    public void setLicenseDate(LocalDateTime licenseDate) {
        LicenseDate = licenseDate;
    }

    public void setBusinessStatus(int businessStatus) {
        this.businessStatus = businessStatus;
    }

    public void setBusinessStatusCode(int businessStatusCode) {
        this.businessStatusCode = businessStatusCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setRoadNameAddress(String roadNameAddress) {
        this.roadNameAddress = roadNameAddress;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public void setHealthcareProviderCount(int healthcareProviderCount) {
        this.healthcareProviderCount = healthcareProviderCount;
    }

    public void setPatientRoomCount(int patientRoomCount) {
        this.patientRoomCount = patientRoomCount;
    }

    public void setTotalNumberOfBeds(int totalNumberOfBeds) {
        this.totalNumberOfBeds = totalNumberOfBeds;
    }

    public void setTotalAreaSize(float totalAreaSize) {
        this.totalAreaSize = totalAreaSize;
    }
}
