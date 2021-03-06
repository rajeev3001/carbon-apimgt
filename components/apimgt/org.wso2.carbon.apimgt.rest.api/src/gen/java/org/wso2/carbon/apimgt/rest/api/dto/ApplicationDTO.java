package org.wso2.carbon.apimgt.rest.api.dto;

import org.wso2.carbon.apimgt.rest.api.dto.ApplicationKeyDTO;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;



@ApiModel(description = "")
public class ApplicationDTO  {
  
  
  @NotNull
  private String applicationId = null;
  
  @NotNull
  private String name = null;
  
  @NotNull
  private String subscriber = null;
  
  @NotNull
  private String throttlingTier = null;
  
  
  private String callbackUrl = null;
  
  
  private String description = null;
  
  
  private String groupId = null;
  
  
  private List<ApplicationKeyDTO> keys = new ArrayList<ApplicationKeyDTO>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("applicationId")
  public String getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * If subscriber is not given user invoking the API will be taken as the subscriber.
   **/
  @ApiModelProperty(required = true, value = "If subscriber is not given user invoking the API will be taken as the subscriber.")
  @JsonProperty("subscriber")
  public String getSubscriber() {
    return subscriber;
  }
  public void setSubscriber(String subscriber) {
    this.subscriber = subscriber;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("throttlingTier")
  public String getThrottlingTier() {
    return throttlingTier;
  }
  public void setThrottlingTier(String throttlingTier) {
    this.throttlingTier = throttlingTier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("callbackUrl")
  public String getCallbackUrl() {
    return callbackUrl;
  }
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("keys")
  public List<ApplicationKeyDTO> getKeys() {
    return keys;
  }
  public void setKeys(List<ApplicationKeyDTO> keys) {
    this.keys = keys;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDTO {\n");
    
    sb.append("  applicationId: ").append(applicationId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  subscriber: ").append(subscriber).append("\n");
    sb.append("  throttlingTier: ").append(throttlingTier).append("\n");
    sb.append("  callbackUrl: ").append(callbackUrl).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  groupId: ").append(groupId).append("\n");
    sb.append("  keys: ").append(keys).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
