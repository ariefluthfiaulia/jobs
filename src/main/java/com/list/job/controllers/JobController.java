package com.list.job.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class JobController {

  @RequestMapping("/jobs")
  public List<Object> getJobs() {
    String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
    RestTemplate restTemplate = new RestTemplate();
    Object[] jobs = restTemplate.getForObject(url, Object[].class);
    return Arrays.asList(jobs);
  }

  @RequestMapping("/job/{id}")
  public Object getDetailJob(@PathVariable(value = "id") String id) {
    String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id;
    RestTemplate restTemplate = new RestTemplate();
    Object jobs = restTemplate.getForObject(url, Object.class);
    return jobs;
  }
}
