/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.api.server.identity.governance.v1.dto;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.identity.governance.v1.dto.LinkDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



/**
 * Governance connector response with minimal attributes.
 **/


@ApiModel(description = "Governance connector response with minimal attributes.")
public class CategoryConnectorsResDTO  {
  
  
  
  private String id = null;
  
  
  private List<LinkDTO> links = new ArrayList<LinkDTO>();

  
  /**
   * Connector id.
   **/
  @ApiModelProperty(value = "Connector id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Connectors of the category with minimal attributes.
   **/
  @ApiModelProperty(value = "Connectors of the category with minimal attributes.")
  @JsonProperty("links")
  public List<LinkDTO> getLinks() {
    return links;
  }
  public void setLinks(List<LinkDTO> links) {
    this.links = links;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryConnectorsResDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
