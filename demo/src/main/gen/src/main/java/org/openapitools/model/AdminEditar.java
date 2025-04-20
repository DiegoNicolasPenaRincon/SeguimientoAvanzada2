package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdminEditar
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-19T20:06:50.056216900-05:00[America/Bogota]", comments = "Generator version: 7.7.0")
public class AdminEditar {

  private String nombre;

  private String correo;

  private String contraseña;

  public AdminEditar() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdminEditar(String nombre, String correo, String contraseña) {
    this.nombre = nombre;
    this.correo = correo;
    this.contraseña = contraseña;
  }

  public AdminEditar nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   */
  @NotNull 
  @Schema(name = "nombre", example = "Administrador Principal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public AdminEditar correo(String correo) {
    this.correo = correo;
    return this;
  }

  /**
   * Get correo
   * @return correo
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "correo", example = "admin@empresa.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correo")
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public AdminEditar contraseña(String contraseña) {
    this.contraseña = contraseña;
    return this;
  }

  /**
   * Get contraseña
   * @return contraseña
   */
  @NotNull 
  @Schema(name = "contraseña", example = "NuevaClaveSegura123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contraseña")
  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminEditar adminEditar = (AdminEditar) o;
    return Objects.equals(this.nombre, adminEditar.nombre) &&
        Objects.equals(this.correo, adminEditar.correo) &&
        Objects.equals(this.contraseña, adminEditar.contraseña);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, correo, contraseña);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminEditar {\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
    sb.append("    contraseña: ").append("*").append("\n");
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

