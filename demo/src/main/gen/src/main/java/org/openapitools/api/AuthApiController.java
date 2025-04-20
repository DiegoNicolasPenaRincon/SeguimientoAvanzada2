package org.openapitools.api;

import org.openapitools.model.AuthLoginPost200Response;
import org.openapitools.model.AuthLoginPost401Response;
import org.openapitools.model.AuthPerfilDelete200Response;
import org.openapitools.model.AuthPerfilDelete400Response;
import org.openapitools.model.AuthPerfilDelete401Response;
import org.openapitools.model.AuthPerfilDelete500Response;
import org.openapitools.model.AuthPerfilPut200Response;
import org.openapitools.model.AuthPerfilPut400Response;
import org.openapitools.model.AuthRegisterPost201Response;
import org.openapitools.model.AuthRegisterPost400Response;
import org.openapitools.model.AuthVerifyPost200Response;
import org.openapitools.model.AuthVerifyPost400Response;
import org.openapitools.model.AuthVerifyPost404Response;
import org.openapitools.model.Login;
import org.openapitools.model.UsuarioEditar;
import org.openapitools.model.UsuarioRegistro;
import org.openapitools.model.VerificarCodigo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-19T20:06:50.056216900-05:00[America/Bogota]", comments = "Generator version: 7.7.0")
@Controller
@RequestMapping("${openapi.plataformaDeReportesDeSeguridad.base-path:/v1}")
public class AuthApiController implements AuthApi {

    private final NativeWebRequest request;

    @Autowired
    public AuthApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
