package pratz.tech.controller.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * User data type for both entity and rest model
 */
@ApiModel(description = "User data type for both entity and rest model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-22T13:38:04.418721+07:00[Asia/Bangkok]")
@Entity
@Table(name="users")
public class User   {
  @JsonProperty("password")
  private String password;

  @JsonProperty("nickname")
  private String nickname;

  @JsonProperty("email")
  private String email;
  @Id
  @JsonProperty("userId")
  private String userId;

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 
   * @return password
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * 
   * @return nickname
  */
  @ApiModelProperty(value = "")


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * 
   * @return userId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.password, user.password) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.userId, user.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, nickname, email, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

