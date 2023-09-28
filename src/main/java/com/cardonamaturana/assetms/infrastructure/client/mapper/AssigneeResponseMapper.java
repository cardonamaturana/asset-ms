package com.cardonamaturana.assetms.infrastructure.client.mapper;

import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.BRANCH;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.CONTRIBUTOR;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.EMPLOYEE;
import static com.cardonamaturana.assetms.shared.utils.ClassNameTypes.PRAGMATICO;

import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.BranchResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.ContributorResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.EmployeeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.PragmaticoResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
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

  public AssigneeResponse toDto(String classNameType, Map<?, ?> assignee) {
    AssigneeResponse assignResponse;
    if (classNameType == null) {
      return null;
    }

    if (classNameType.equals(CONTRIBUTOR.getMessage())) {
      return assignResponse = objectMapper.convertValue(assignee, ContributorResponse.class);
    } else if (classNameType.equals(PRAGMATICO.getMessage())) {
      return assignResponse = objectMapper.convertValue(assignee, PragmaticoResponse.class);
    } else if (classNameType.equals(BRANCH.getMessage())) {
      return assignResponse = objectMapper.convertValue(assignee, BranchResponse.class);
    } else if (classNameType.equals(EMPLOYEE.getMessage())) {
      return assignResponse = objectMapper.convertValue(assignee, EmployeeResponse.class);
    }

    throw new IllegalArgumentException("Unsupported Assignee type: " + assignee.getClass());
  }

}
