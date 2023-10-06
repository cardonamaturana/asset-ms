package com.cardonamaturana.assetms.infrastructure.client.mapper;

import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.BRANCH;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.CONTRIBUTOR;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.EMPLOYEE;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.PRAGMATICO;
import static com.cardonamaturana.assetms.shared.utils.CustomHeaders.X_OBJECT_TYPE;

import com.cardonamaturana.assetms.infrastructure.client.EventDto;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.BranchResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.ContributorResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.EmployeeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.PragmaticoResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssigneeResponseMapper {

  private final EmployeeResponseMapper employeeResponseMapper;
  private final PragmaticoResponseMapper pragmaticoResponseMapper;
  private final BranchResponseMapper branchResponseMapper;
  private final ContributorResponseMapper contributorResponseMapper;
  private final ObjectMapper objectMapper;


  public AssigneeResponse toDto(EventDto event) throws JsonProcessingException {

    String classType = event.getHeaders().get(X_OBJECT_TYPE.getMessage());
    String data = event.getData();

    if (Objects.isNull(classType) || Objects.isNull(data)) {
      return new AssigneeResponse("");
    }

    if (classType.equals(CONTRIBUTOR.getMessage())) {
      return objectMapper.readValue(data, ContributorResponse.class);
    } else if (classType.equals(PRAGMATICO.getMessage())) {
      return objectMapper.readValue(data, PragmaticoResponse.class);
    } else if (classType.equals(BRANCH.getMessage())) {
      return objectMapper.readValue(data, BranchResponse.class);
    } else if (classType.equals(EMPLOYEE.getMessage())) {
      return objectMapper.readValue(data, EmployeeResponse.class);
    }

    throw new IllegalArgumentException("Unsupported Assignee type: " + data.getClass());
  }

}
