package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import java.io.File;
import java.io.IOException;


public class JsonValidation {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Load JSON Schema
        JsonNode schemaNode = objectMapper.readTree(new File("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceProblems/Schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);
        // Load JSON Data
        JsonNode jsonData = objectMapper.readTree(new File("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceProblems/studentInfo.json"));
        // Validate JSON
        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("JSON is valid!");
        }
        else {
            System.out.println("Invalid JSON!");
        }
    }

}
