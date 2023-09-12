package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * ParentWithNullable
 */

@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ChildWithNullable.class, name = "ChildWithNullable")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ParentWithNullable {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CHILDWITHNULLABLE("ChildWithNullable");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String nullableProperty = null;

  public ParentWithNullable type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ParentWithNullable nullableProperty(String nullableProperty) {
    this.nullableProperty = nullableProperty;
    return this;
  }

  /**
   * Get nullableProperty
   * @return nullableProperty
  */
  
  @ApiModelProperty(value = "")
  @JsonProperty("nullableProperty")
  public String getNullableProperty() {
    return nullableProperty;
  }

  public void setNullableProperty(String nullableProperty) {
    this.nullableProperty = nullableProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentWithNullable parentWithNullable = (ParentWithNullable) o;
    return Objects.equals(this.type, parentWithNullable.type) &&
        Objects.equals(this.nullableProperty, parentWithNullable.nullableProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, nullableProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentWithNullable {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nullableProperty: ").append(toIndentedString(nullableProperty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

