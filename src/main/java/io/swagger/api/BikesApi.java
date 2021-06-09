/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Bike;
import io.swagger.model.Bikes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-04T22:02:01.405Z[GMT]")
@Validated
public interface BikesApi {

    @Operation(summary = "Get bike by bikeid", description = "", security = {
        @SecurityRequirement(name = "api_key")    }, tags={ "bikes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Bike.class))),
        
        @ApiResponse(responseCode = "404", description = "Bike not found") })
    @RequestMapping(value = "/bikes/{bikeid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Bike> getBikeById(@Parameter(in = ParameterIn.PATH, description = "The unique identifier of the bike that needs to be fetched. ", required=true, schema=@Schema()) @PathVariable("bikeid") String bikeid);


    @Operation(summary = "Get all bikes", description = "", security = {
        @SecurityRequirement(name = "api_key")    }, tags={ "bikes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Bikes.class))),
        
        @ApiResponse(responseCode = "404", description = "No bikes found") })
    @RequestMapping(value = "/bikes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Bikes> getBikes(@Parameter(in = ParameterIn.QUERY, description = "Return only bikes with a certain sharingStatus. " ,schema=@Schema()) @Valid @RequestParam(value = "sharingStatus", required = false) String sharingStatus);

}
