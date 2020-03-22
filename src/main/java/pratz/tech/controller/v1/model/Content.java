package pratz.tech.controller.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Content data type for both entity and rest model
 */
@ApiModel(description = "Content data type for both entity and rest model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-22T13:38:04.418721+07:00[Asia/Bangkok]")
@Entity
@Table(name="content")
public class Content   {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("content")
  private String content;

  public Content id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the Content.
   * @return id
  */
  @ApiModelProperty(value = "The id of the Content.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Content content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The description of the Content.
   * @return content
  */
  @ApiModelProperty(value = "The description of the Content.")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.id, content.id) &&
        Objects.equals(this.content, content.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

