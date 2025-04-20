package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuthLoginPost200ResponseUsuario;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuthLoginPost200Response
 */

@JsonTypeName("_auth_login_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-19T20:06:50.056216900-05:00[America/Bogota]", comments = "Generator version: 7.7.0")
public class AuthLoginPost200Response {

  private String token;

  private AuthLoginPost200ResponseUsuario usuario;

  public AuthLoginPost200Response token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AuthLoginPost200Response usuario(AuthLoginPost200ResponseUsuario usuario) {
    this.usuario = usuario;
    return this;
  }

  /**
   * Get usuario
   * @return usuario
   */
  @Valid 
  @Schema(name = "usuario", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usuario")
  public AuthLoginPost200ResponseUsuario getUsuario() {
    return usuario;
  }

  public void setUsuario(AuthLoginPost200ResponseUsuario usuario) {
    this.usuario = usuario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthLoginPost200Response authLoginPost200Response = (AuthLoginPost200Response) o;
    return Objects.equals(this.token, authLoginPost200Response.token) &&
        Objects.equals(this.usuario, authLoginPost200Response.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthLoginPost200Response {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

