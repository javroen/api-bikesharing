package io.swagger.api;

import io.swagger.model.Bike;
import io.swagger.model.Bikes;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-04T22:02:01.405Z[GMT]")
@RestController
public class BikesApiController implements BikesApi {

    private static final Logger log = LoggerFactory.getLogger(BikesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BikesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Bike> getBikeById(@Parameter(in = ParameterIn.PATH, description = "The unique identifier of the bike that needs to be fetched. ", required=true, schema=@Schema()) @PathVariable("bikeid") String bikeid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Bike>(objectMapper.readValue("{\n  \"sharingStatus\" : \"available\",\n  \"bikeid\" : 0,\n  \"type\" : \"type\",\n  \"brand\" : \"brand\"\n}", Bike.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Bike>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Bike>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Bikes> getBikes(@Parameter(in = ParameterIn.QUERY, description = "Return only bikes with a certain sharingStatus. " ,schema=@Schema()) @Valid @RequestParam(value = "sharingStatus", required = false) String sharingStatus) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Bikes>(objectMapper.readValue("[ {\n  \"sharingStatus\" : \"available\",\n  \"bikeid\" : 0,\n  \"type\" : \"type\",\n  \"brand\" : \"brand\"\n}, {\n  \"sharingStatus\" : \"available\",\n  \"bikeid\" : 0,\n  \"type\" : \"type\",\n  \"brand\" : \"brand\"\n} ]", Bikes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Bikes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Bikes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
