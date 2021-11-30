package br.com.emersonluiz.securitykeycloak.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/checks")
public class Check {

    @GetMapping("/withRole")
        @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String checkApi() {
        return "ok";
    }

}
