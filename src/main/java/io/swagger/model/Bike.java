package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bike
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-04T22:02:01.405Z[GMT]")


public class Bike   {
  @JsonProperty("bikeid")
  private Long bikeid = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("type")
  private String type = null;

  /**
   * User Status
   */
  public enum SharingStatusEnum {
    AVAILABLE("available"),
    
    RIDING("riding"),
    
    MAINTENANCE("maintenance");

    private String value;

    SharingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SharingStatusEnum fromValue(String text) {
      for (SharingStatusEnum b : SharingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sharingStatus")
  private SharingStatusEnum sharingStatus = null;

  public Bike bikeid(Long bikeid) {
    this.bikeid = bikeid;
    return this;
  }

  /**
   * Get bikeid
   * @return bikeid
   **/
  @Schema(description = "")
  
    public Long getBikeid() {
    return bikeid;
  }

  public void setBikeid(Long bikeid) {
    this.bikeid = bikeid;
  }

  public Bike brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   **/
  @Schema(description = "")
  
    public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Bike type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Bike sharingStatus(SharingStatusEnum sharingStatus) {
    this.sharingStatus = sharingStatus;
    return this;
  }

  /**
   * User Status
   * @return sharingStatus
   **/
  @Schema(description = "User Status")
  
    public SharingStatusEnum getSharingStatus() {
    return sharingStatus;
  }

  public void setSharingStatus(SharingStatusEnum sharingStatus) {
    this.sharingStatus = sharingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bike bike = (Bike) o;
    return Objects.equals(this.bikeid, bike.bikeid) &&
        Objects.equals(this.brand, bike.brand) &&
        Objects.equals(this.type, bike.type) &&
        Objects.equals(this.sharingStatus, bike.sharingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bikeid, brand, type, sharingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bike {\n");
    
    sb.append("    bikeid: ").append(toIndentedString(bikeid)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sharingStatus: ").append(toIndentedString(sharingStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
