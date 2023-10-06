package com.cardonamaturana.assetms.shared.utils;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ClassNameTypes {

  ASSIGNEE("AssigneeResponse"),
  BRANCH("BranchResponse"),
  CONTRIBUTOR("ContributorResponse"),
  EMPLOYEE("EmployeeResponse"),
  PRAGMATICO("PragmaticoResponse");


  private final String message;


}
