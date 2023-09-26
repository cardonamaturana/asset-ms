package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.BranchResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.ContributorResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.EmployeeResponse;
import com.cardonamaturana.assetms.infrastructure.client.response.PragmaticoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssigneeResponseMapper {

  private final EmployeeResponseMapper employeeResponseMapper;
  private final PragmaticoResponseMapper pragmaticoResponseMapper;
  private final BranchResponseMapper branchResponseMapper;
  private final ContributorResponseMapper contributorResponseMapper;

  public AssigneeResponse toDto(AssigneeResponse assignee) {
    AssigneeResponse assignResponse;

    if (assignee instanceof ContributorResponse) {
      assignResponse = contributorResponseMapper.toDto((ContributorResponse) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof PragmaticoResponse) {
      assignResponse = pragmaticoResponseMapper.toDto((PragmaticoResponse) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof BranchResponse) {
      assignResponse = branchResponseMapper.toDto((BranchResponse) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof EmployeeResponse) {
      assignResponse = employeeResponseMapper.toDto((EmployeeResponse) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assignee.getClass());
  }
}
